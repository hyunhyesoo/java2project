package w0827;

public class LAB {
    public static void main(String[] args) {
        String[] arr = {
                "행동은 모든 성공의 기초이다.",
                "간단하게 살아라. 소박함 속에 자유가 있다.",
                "천 마디 말보다 한 번의 행동이 더 값지다.",
                "기회는 스스로 만드는 것이다.",
                "오늘 걷지 않으면 내일은 뛰어야 한다.",
                "실패는 넘어짐이 아니라, 거기서 일어나지 못하는 것이다.",
                "작은 성취가 큰 변화를 만든다."
        };

        int today = (int) (Math.random() * arr.length);
        //ㄴ>실수형 랜덤 값을 정수로 형 변환 후 사용
        System.out.println("오늘의 명언 --> " + arr[today]);
    }
}
