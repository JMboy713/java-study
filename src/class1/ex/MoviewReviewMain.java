package class1.ex;

public class MoviewReviewMain {
	public static void main(String[] args) {
		MovieReview review1 = new MovieReview();
		review1.title="인셉션";
		review1.review="인생은 무한 루프!";

		MovieReview review2 = new MovieReview();
		review2.title="어바웃 타임";
		review2.review="인생 시간 영화!";

		MovieReview[] reviews=new MovieReview[]{review1,review2};
		for(int i=0;i<reviews.length;i++){
			System.out.println("영화 제목 : "+reviews[i].title+", 리뷰 : "+reviews[i].review);
		}

	}
}
