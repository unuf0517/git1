import java.util.Random;
import java.util.Scanner;

public class work3_0411 {
    static Scanner sc=new Scanner(System.in);
    static Random r=new Random();
    public static void main(String[] args) {
        while(true){
            welcome();
            int[] size=new int[3];//{height,width,bomb}
            int[] marks=new int[1];
            int[] n=new int[1];//记录次数
            difficulty(size,marks);
            int[][] map=new int[size[0]][size[1]];
            System.out.println("0--退出游戏，1--开始游戏，2--重新游戏");
            switch (input(0,2)){
                case 0: end();
                case 1:
                    game(map,size,marks,n);
                    break;
                case 2:
                    continue;
            }
            break;
        }

    }

    public static void game(int[][] map,int[] size,int[] marks,int[] n){
        init(map,marks);
        while(true){
            System.out.println("1--排雷，2--去标记/标记雷，3--重置地图，4--重新游戏，5--结束游戏，0--退出游戏");
            switch (input(0,5)){
                case 0: end();
                case 1:
                    remove(map,size,n,marks);
                    show(map,marks,n);
                    isWin(map,n,size,marks);
                    break;
                case 2:
                    if(n[0]==0){
                        System.out.println("还未排雷，无法标记");
                    }else{
                        mark(map,size,marks);
                        show(map,marks,n);
                        break;
                    }
                case 3:
                    game(map,size,marks,n);
                    break;
                case 4:
                    main(null);//暴力重启
                case 5:
                    over(map,n,size,marks);
            }
        }
    }

    /**
     * 排雷
     */
    public static void remove(int[][] map,int[] size,int[] n,int[] marks){
        while(true){
            System.out.println("输入x轴");
            int x=input(1,size[1])-1;
            System.out.println("输入y轴");
            int y=input(1,size[0])-1;
            if(map[y][x]==10){//用户输入的x、y对应的map[y][z]
                System.out.println("已经排过，无法再次排雷，请重新输入");
                break;
            }
            if(map[y][x]==11 ||  map[y][x]==12){
                System.out.println("此位置被标记，无法排雷，请先去除标记");
                break;
            }
            if(map[y][x]>=1 && map[y][x]<=8){
                System.out.println("此位置已经被排过");
                break;
            }
            if(n[0]==0) {
                make(size,map,x,y);//点击后再布雷，保证第一个九宫内没有雷
                n[0]++;
            }
            open(map,x,y,n,size,marks);
            break;
        }
    }
    
    /**
     * 打开格子--排雷操作
     * @param map 每一格的状态信息
     * @param x x轴坐标，即二维数组的列
     * @param y y轴坐标，即二维数组的行
     * @param n 记录排雷次数
     * @param size 保存{行，列，雷数}
     * @param marks 标记操作
     */
    public static void open(int[][] map,int x,int y,int[] n,int[] size,int[] marks){
        if(map[y][x]==9) over(map,n,size,marks);
        if(map[y][x]==10 || (map[y][x]>=1 && map[y][x]<=8) || map[y][x]==11 || map[y][x]==12){
            return;
        }
        for(int i=y-1;i<=y+1;i++){
            for(int j=x-1;j<=x+1;j++){
                //如果map[i][j]超出范围、已经开过、是雷则跳过
                if(ifOutrange(map,j,i)) continue;
                if(map[i][j]==9 || map[i][j]==11) {
                    map[y][x]++;
                }
            }
        }
        if(map[y][x]==0){//如果周围一个雷都没有则延展出去判断四周位置的情况
            map[y][x]=10;
            for(int i=y-1;i<=y+1;i++){
                for(int j=x-1;j<=x+1;j++){
                    if(ifOutrange(map,j,i)) continue;
                    if(map[i][j]==0) open(map,j,i,n,size,marks);
                }
            }
        }
    }

    /**
     * 胜利条件
     */
    public static void isWin(int[][] map,int[] n,int[] size,int[] marks){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                // 只要还有非雷且未开的格子，就没赢
                if (map[i][j] == 0 || map[i][j] == 12) {
                    return;
                }
            }
        }
        System.out.println("你赢了");
        over(map,n,size,marks);
    }

    /**
     *判断xy是否超出总范围
     */
    public static boolean ifOutrange(int[][] map,int x,int y){
        return y<0 || y>=map.length || x<0 || x>=map[0].length;
    }

    /**
     * 标记
     */
    public static void mark(int[][] map,int[] size,int[] marks){
        System.out.println("输入x轴");
        int x=input(1,size[1])-1;
        System.out.println("输入y轴");
        int y=input(1,size[0])-1;
        if(map[y][x]==9){
            map[y][x]=11;
            marks[0]--;
        }else if(map[y][x]==0){
            map[y][x]=12;
            marks[0]--;
        }else if(map[y][x]==11){
            map[y][x]=9;
            marks[0]++;
        }else if(map[y][x]==12){
            map[y][x]=0;
            marks[0]++;
        }else if(map[y][x]==10){
            System.out.println("已被排雷，无法标记");
        }
    }

    /**
     *显示当前地图状态
     */
    public static void show(int[][] map,int[] marks,int[] size){
        xaxis(map);
        System.out.println();
        for(int i=0;i<map.length;i++){
            yaxis(map,i);
            for(int j=0;j<map[i].length;j++) {
                if(map[i][j]==10){//已开
                    System.out.print("□  ");
                }else if(map[i][j]==0 || map[i][j]==9){//未开
                    System.out.print("■  ");
                }else if(map[i][j]==12 || map[i][j]==11){//标记
                    System.out.print("▲  ");
                }else{
                    System.out.print(map[i][j]+"  ");
                }

            }
            System.out.println();
        }
        System.out.println("          ✸"+marks[0]);
    }

    /**
     *游戏结束，展示所有雷
     */
    public static void over(int[][] map,int[] n,int[] size,int[] marks){
        xaxis(map);
        if(n[0]==0){
            make(size,map);//如果没有排过雷则全随机
        }
        for(int j=0;j<map.length;j++){
            yaxis(map,j);
            for(int i=0;i<map[j].length;i++){
                if(map[j][i]==9 || map[j][i]==11){
                    System.out.print("●  ");
                }else{
                    System.out.print("□  ");
                }
            }
            System.out.println();
        }
        System.out.println("游戏结束");
        System.out.println("1--重置游戏，2--重新游戏，0--退出游戏");
        switch (input(0,2)){
            case 0: end();
            case 1:
                game(map,size,marks,n);
                break;
            case 2: main(null);
        }
    }

    /**
     * 欢迎界面
     */
    public static void welcome(){
        System.out.println("************************");
        System.out.println("***欢迎来到扫雷游戏1.0***");
        System.out.println("************************");
    }

    /**
     * 选择难度
     */
    public static void difficulty(int[] size,int[] marks){
        System.out.println("请选择难度");
        System.out.println("1--Easy 9X9，2--Hard 16X16，3--Expert 16X30，4--Custom，0--退出游戏");
        int difficulty=input(0,4);
        switch(difficulty){
            case 1:
                size[0]=size[1]=9;
                size[2]=10;
                marks[0]=10;
                break;
            case 2:
                size[0]=size[1]=16;
                size[2]=40;
                marks[0]=40;
                break;
            case 3:
                size[0]=16;
                size[1]=30;
                size[2]=99;
                marks[0]=99;
                break;
            case 4:
                custom(size,marks);
                break;
            case 0: end();
        }
    }

    /**
     * 布置雷
     * @param size 统计高宽、雷的数量的数组
     * @param map 总布局
     */
    public static void make(int[] size,int[][] map,int x,int y){
        int sum=size[2];
        a:while(true){//布置雷
            for(int i=0;i<map.length && sum>0;i++){
                for(int j=0;j<map[i].length && sum>0;j++){
                    if(i>=y-1 && i<=y+1 && j>=x-1 && j<=x+1) continue;//第一次排雷的九宫格内不能有雷
                    if(map[i][j]==9) continue;//不能重复布雷
                    int num=r.nextInt(size[0]*size[1]);
                    if(num<size[2]){//以高*宽来控制总数，只有随机数小于雷的数量才能布雷，使每个格子是雷概率不再是nextInt(2)的1/2，而是总雷数/总格子数
                        map[i][j]=9;//用9来表示雷，因为扫雷中一个九宫格内最多只有8个雷，不会出现9整个数字
                        sum--;
                    }
                    if(sum==0) break a;//只有达到雷的数量才能停止循环
                }
            }
        }
    }

    /**
     *重载--没排过雷时全随机
     */
    public static void make(int[] size,int[][] map){
        int sum=size[2];
        while(true){//布置雷
            for(int i=0;i<map.length && sum>0;i++){
                for(int j=0;j<map[i].length && sum>0;j++){
                    if(map[i][j]==9) continue;//不能重复补雷
                    int num=r.nextInt(size[0]*size[1]);
                    if(num<size[2]){//以高*宽来控制总数，只有随机数小于雷的数量才能布雷，使每个格子是雷概率不再是nextInt(2)的1/2，而是总雷数/总格子数
                        map[i][j]=9;//用9来表示雷，因为扫雷中一个九宫格内最多只有8个雷，不会出现9整个数字
                        sum--;
                    }
                }
            }
            if(sum==0) break;//只有达到雷的数量才能停止循环
        }
    }

    /**
     * 生成地图
     */
    public static void init(int[][] map,int[] marks){
        xaxis(map);
        for(int i=0;i<map.length;i++){
            yaxis(map,i);
            for(int j=0;j<map[i].length;j++) {
                System.out.print("■  ");
            }
            System.out.println();
        }
        System.out.println("          ✸"+marks[0]);
    }

    /**
     * 生成辅助x坐标
     */
    public static void xaxis(int[][] map){
        for(int i=0;i<map[0].length+1;i++){
            if(i==0) {
                System.out.print("+  ");
            }else{
                if(i>=10){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+"  ");
                }
            }
        }
        System.out.println();
    }

    /**
     * 生成辅助x坐标
     */
    public static void yaxis(int[][] map,int i){
        if(i>=9){
            System.out.print((i+1)+" ");
        }else{
            System.out.print((i+1)+"  ");
        }
    }

    /**
     * 自定义
     * @param size 统计高宽、雷的数量的数组
     */
    public static void custom(int[] size,int[] marks){
        height:while(true){
            System.out.println("输入高度");
            size[0]=input(1,999);//输入自定义的高度
            while(true){
                System.out.println("输入宽度，输入0返回上一步");
                size[1]=input(0,999);//输入自定义的宽度
                if(size[1]==0) continue height;
                int sum=size[0]*size[1];//总格子数
                if(sum>5000){
                    System.out.println("数量太大，超过了5000格，请重新输入");
                    continue height;
                }
                System.out.println("输入雷的数量，输入0返回上一步");
                size[2]=input(0,sum);//输入雷的数量
                if(size[2]>sum){
                    System.out.println("数量超过格子数，请重新输入");
                    continue;
                }
                marks[0]=size[2];
                break height;
            }
        }
    }

    /**
     * 输入
     * @param lower 输入下限
     * @param upper 输入上限
     */
    public static int input(int lower,int upper){
        int num;
        while(true){
            if(sc.hasNextInt()){
                num=sc.nextInt();
                if(num<lower || num>upper){
                    System.out.println("不在范围内，请重新输入");
                    continue;
                }
                break;
            }
            sc.next();
            System.out.println("输入不合法，请重新输入");
        }
        return num;
    }

    /**
     * 结束游戏
     */
    public static void end(){
        System.exit(0);
    }
}