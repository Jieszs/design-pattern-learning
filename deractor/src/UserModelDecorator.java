public class UserModelDecorator implements UserModel {
    private UserModel userModel;

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public void operator() {
        if (userModel == null) return;
        userModel.operator();
    }
}
