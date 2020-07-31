import com.Abe.client.Client;

/**
 * JuiceClub 自助饮品消费系统
 * Author: Abe
 * Date: 2020/07/31
 */

public class Main {

    public static void main(String[] args) {

        // 初始化客户端对象
        Client client = new Client();

        // 开张营业
        while (true) {
            client.welcomeWindow();
            System.out.println();
        }

    }

}
