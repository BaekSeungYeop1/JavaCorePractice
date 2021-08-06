package kr.ac.daegu.bsy;
// 게시판 글 하나의 정보를 저장하는 클래스
public class BoardVo {
    private String register;
    private String subject;
    private String email;
    private String content;
    private String passwd;

    public String getRegister() {
        return register;
    }

    public String getSubject() {
        return subject;
    }

    public String getEmail() {
        return email;
    }

    public String getContent() {
        return content;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public BoardVo(String register, String subject, String email, String content, String passwd) {
        this.register = register;
        this.subject = subject;
        this.email = email;
        this.content = content;
        this.passwd = passwd;
    }




}
