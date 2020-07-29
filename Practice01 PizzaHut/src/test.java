import com.Abe.client.Client;

public class test {
    public static void main(String[] args) {

        // 初始化客户端对象
        Client client = new Client();

        // 开张营业
        while (true) {
            client.welcomeWindow();
        }
    }
}
