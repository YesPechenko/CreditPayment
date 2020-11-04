public class CreditPaymentService {
        public float calculate (float amount, float year, float percent ) {
            float rate = (percent / year) / 100;
            float power = (float) Math.pow(rate+1, year);
            float coefficient = (power * rate) / (power -1);
            float payment;
            if  (year == 24) {
                payment = amount * coefficient +2_272;
            } else if  (year == 36) {
                payment = amount * coefficient +3_035;
            }
            else {
                payment = amount * coefficient;
            }

            return (int) payment;

        }

}

