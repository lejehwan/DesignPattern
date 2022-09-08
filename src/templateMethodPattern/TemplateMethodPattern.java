package templateMethodPattern;

public class TemplateMethodPattern {
    /**
     *
     * 템플릿 메서드 패턴 : 특정 작업을 처리하는 일부분을 서브 클래스로 캡슐화 하여 전체적인 구조는 유지하되, 특정 단계의 내용을 바꾸는 패턴
     */
    public static void main(String[] args) {
        // 전체 적인 구조 -> 입장 > 수업 > 퇴장 은 유지하되,
        // 특정 단계 -> 각 선생님들의 수업만 바꿈
        Teacher KTeacher = new KorTeacher();
        KTeacher.startClass();

        Teacher ETeacher = new EngTeacher();
        ETeacher.startClass();
    }
}
