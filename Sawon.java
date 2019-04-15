package Sawon;

public class Sawon {
	String id;
	int time_pay;
	int rank;
	int work_time;
	int week_pay;

	public Sawon() {

	}

	public Sawon(String id, int rank, int work_time) {
		this.id = id;
		this.rank = rank;
		this.work_time = work_time;

		if (rank == 1) {
			this.time_pay = 10000;
		} else if (rank == 2) {
			this.time_pay = 5000;
		} else {
			this.time_pay = 2000;
		}
		if (this.work_time > 36) {
			this.time_pay += this.time_pay * 0.5;
		}
		
		if(this.work_time >= 50) this.work_time = 50;
		this.week_pay = cal_pay(this.time_pay, this.work_time);
		
		
	}

	int cal_pay(int time_pay, int work_time) {
		
		int week_pay = time_pay * work_time;
		return week_pay;
	}
	
	@Override
	public String toString() {
		String str = id + "\t" + rank + "\t" + time_pay + "\t" + work_time + "\t" + week_pay;
		return str;
	}
}
