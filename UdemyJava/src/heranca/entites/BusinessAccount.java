package heranca.entites;

public class BusinessAccount  extends Account{

	private Double loanLimit;
	
	public BusinessAccount() {
		
	}

	

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.setLoanLimit(loanLimit);;
	}



	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
}
