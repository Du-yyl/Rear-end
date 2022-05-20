/**
 * time :2022/5/10 10:12 41
 * ClassName :UserService
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class UserService {
    public void requiter(String name, String password) throws UserOperateException {
        int nameLen = name.trim().length();
        int passwordLen = password.trim().length();

        if (nameLen == 0 || passwordLen == 0) {
            throw new UserOperateException("用户名或密码不能为空");
        } else if (nameLen >= 13 || passwordLen >= 13) {
            throw new UserOperateException("用户名或密码过长");
        } else if (nameLen < 6 || passwordLen < 6) {
            throw new UserOperateException("用户名或密码过短");
        }
    }
}
