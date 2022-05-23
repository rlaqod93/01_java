package com.pcwk.oop02.Inter;

public class TourGuide {

	//private Providable tour = new KoreaTour();
	private Providable tour = null;
	
	public TourGuide() {
		
		
	}
	//약한 결함 : KoreaTour(), JapanTour()알필요가 없다.
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	
	public void leisureSports() {
		tour.leisureSports();
	}// sports

	public void sightseeing() {
		tour.sightseeing();
	}// 경관보기

	public void food() {
		tour.food();
	}// 음식

}
