public class ChuoiKiTu {
    private String text;

    public ChuoiKiTu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ChuoiKiTu() {

    }

    public int demNguyenAm() {
        int dem = 0;
        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                dem++;
            }
        }
        return dem;
    }
    public int demInHoa(){
        int dem = 0;
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(Character.isUpperCase(c)){
                dem++;
            }
        }
        return dem;
    }
}
