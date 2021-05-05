
public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("Mysql eklendi ...");
	}

	@Override
	public int hesapla() {
		// TODO Auto-generated method stub
		return 0;
	}

}
