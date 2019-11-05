/**
 * @author zj
 * @date 2019/11/5
 */
public class ObserverCXK {

    /**
     * 自我介绍
     *
     * @param speciality
     */
    public void selfIntroduction(String speciality) {
        System.out.println("全民制作人们好，我是个人偶像练习生" + this.getClass().getSimpleName() + "喜欢" + speciality);
    }

    /**
     * @param target
     */
    public void issueLawyerLetter(String target) {
        System.out.println(this.getClass().getSimpleName() + "发律师函给" + target);
    }


}
