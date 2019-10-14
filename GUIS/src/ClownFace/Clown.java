pubic class Clown extends Application {
	public static void main(String[] args) {launch(args);}
	
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		//here...

		Scene scene = new Scene(pane, 750, 750);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
