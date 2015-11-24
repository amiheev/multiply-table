/**
 * Created by Alexey on 20.11.2015.
 */
public class Controller implements IEnterActionListener,ISummary,ITextField, IRefreshActionListner {
    private PowerTable table = new PowerTable();
    private IEnterButton enter;
    private IRefreshButton start;
    private ISummary summary;
    private ISummary answer;
    private ITextField textResult;
    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setStartButton(IRefreshButton button){
        this.start = button;
    }

    public void setEnter(IEnterButton enter){
        this.enter = enter;
    }

    public void setSummary(ISummary summary){
        this.summary = summary;
    }

    public void setTextResult(ITextField textResult){
        this.textResult = textResult;
    }

    public void setAnwser(ISummary answer){
        this.answer = answer;
    }


    @Override
    public void setText(String text) {
        summary.setText(table.getExpression(x,y));
    }

    @Override
    public String getText() {
        return textResult.getText();
    }

    @Override
    public void action() {
        String check = table.checkAnswer(getX(),getY(), Integer.valueOf(getText()));
        answer.setText(check);
        if (check.equals("true")){
            refresh();
        }
    }

    @Override
    public void refresh() {
        setX(table.getFactor());
        setY(table.getFactor());
        summary.setText(table.getExpression(getX(),getY()));
    }
}
