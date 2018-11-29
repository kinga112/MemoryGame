import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

	public class MemoryGame extends Application {

		int ButtonClicks = 0;
		
		int storeW[] = new int[20];
		int storeH[] = new int[20];
		
		int correctW[] = new int[20];
		int correctH[] = new int[20];

	    private final IntegerProperty value = new SimpleIntegerProperty();

	    class NumberButtonHandler implements EventHandler<ActionEvent> {
	       private final int number ;
	        NumberButtonHandler(int number) {
	            this.number = number ;
	        }
	        @Override
	        public void handle(ActionEvent event) {
	           value.set(value.get() * 10 + number);
	        }

	    }

	    @Override
	    public void start(Stage primaryStage) {
	    	
	    	//
	 	   	//START SCREEN
	    	//
	    	
	    	GridPane grid1 = createGrid();
	    	
	    	BorderPane root1 = new BorderPane();
	        root1.setPadding(new Insets(10));
	        root1.setCenter(grid1);

	        Scene start = new Scene(root1, 365, 300);
	        
	        primaryStage.setScene(start);
	        primaryStage.setResizable(false);
	        primaryStage.show();
			
			Button startButton = new Button("START");
			
			
			Button Restart = new Button("RESTART");
			Button NextLevel = new Button("	NEXT	\n	LEVEL	");
	        
	    	Button exit = new Button("EXIT");
	    	
	    	startButton.setMinHeight(50);
	    	startButton.setMinWidth(100);
	    	exit.setMinHeight(50);
	    	exit.setMinWidth(100);
	    	
	    	Button Rules = new Button("RULES");
	    	Rules.setMinSize(100, 50);
	    	grid1.add(Rules,0,1);
	    	
	    	grid1.add(startButton, 0, 0);
	    	grid1.add(exit, 0, 2);
	    	
	    	GridPane grid = createGrid();
	        BorderPane root = new BorderPane();
	        root.setPadding(new Insets(10));
	        root.setCenter(grid);
	        Scene scene = new Scene(root, 365, 350);
	        
	        //Pressing START, begins game
	    	startButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	            	primaryStage.setScene(scene);
	            	
	            }
	        });
	    	
	    	//Pressing EXIT, closes game
	    	exit.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	            	System.exit(0);
	            }
	        });
	    	
	    	
	    	
	    	
	    	
	    	//
	    	//RULES
	    	//
	    	
	    	GridPane grid2 = createGrid();
	        BorderPane root2 = new BorderPane();
	        root2.setPadding(new Insets(10));
	        root2.setCenter(grid2);
	        Scene rules = new Scene(root2, 365, 300);
	    	
	        Button Back = new Button("Back");
	        Back.setMinSize(60, 20);
	        grid2.add(Back, 0, 2);
	        
	        Label Title = new Label("RULES");
	        grid2.add(Title, 0, 0);
	        Label Intructions = new Label("Memorize the posistion of the red box.\nAfter the red box finishes displaying"
	        		+ "\npress the 'Ready' button and input\nthe positions of the red box");
	        grid2.add(Intructions, 0, 1);
	        
	    	Rules.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	            	
	            	primaryStage.setScene(rules);
	            	
	            }
	        });
	    	
	    	Back.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	            	
	            	primaryStage.setScene(start);
	            	
	            }
	        });
	    	
	    	
	    	
	    	//
	    	//Game
	    	//
	    	
	    	Button Ready = new Button("Ready");
	    	Ready.setMinSize(100, 50);
	    	grid.add(Ready,1,3);
	    	Ready.setDisable(true);

	        Button TopL = new Button("");
	        Button TopC = new Button("");
	        Button TopR = new Button("");
	        Button MidL = new Button("");
	        Button MidC = new Button("");
	        Button MidR = new Button("");
	        Button BotL = new Button("");
	        Button BotC = new Button("");
	        Button BotR = new Button("");
	        
	        Button Red = new Button("");
	        Button Red2 = new Button("");
	        Button Red3 = new Button("");
	        Button Red4 = new Button("");
	        Button Red5 = new Button("");
	        Button Red6 = new Button("");
	        Button Red7 = new Button("");
	        Button Red8 = new Button("");
	        Button Red9 = new Button("");
	        
	        Red.setStyle ("-fx-background-color: #FF0000");
	        Red2.setStyle("-fx-background-color: #FF0000");
	        Red3.setStyle("-fx-background-color: #FF0000");
	        Red4.setStyle("-fx-background-color: #FF0000");
	        Red5.setStyle("-fx-background-color: #FF0000");
	        Red6.setStyle("-fx-background-color: #FF0000");
	        Red7.setStyle("-fx-background-color: #FF0000");
	        Red8.setStyle("-fx-background-color: #FF0000");
	        Red9.setStyle("-fx-background-color: #FF0000");
	        
	        Red.setMinSize(105, 85);
	        Red2.setMinSize(105, 85);
	        Red3.setMinSize(105, 85);
	        Red4.setMinSize(105, 85);
	        Red5.setMinSize(105, 85);
	        Red6.setMinSize(105, 85);
	        Red7.setMinSize(105, 85);
	        Red8.setMinSize(105, 85);
	        Red9.setMinSize(105, 85);
	        
	        TopL.setMinSize(105, 85);
	        TopC.setMinSize(105, 85);
	        TopR.setMinSize(105, 85);
	        MidL.setMinSize(105, 85);
	        MidC.setMinSize(105, 85);
	        MidR.setMinSize(105, 85);
	        BotL.setMinSize(105, 85);
	        BotC.setMinSize(105, 85);
	        BotR.setMinSize(105, 85);
	        
	        grid.add(TopL, 0, 0);
	        grid.add(TopC, 1, 0);
	        grid.add(TopR, 2, 0);
	        grid.add(MidL, 0, 1);
	        grid.add(MidC, 1, 1);
	        grid.add(MidR, 2, 1);
	        grid.add(BotL, 0, 2);
	        grid.add(BotC, 1, 2);
	        grid.add(BotR, 2, 2);
	        
	        grid.add(Red,  0, 0);
	        grid.add(Red2, 1, 0);
	        grid.add(Red3, 2, 0);
	        grid.add(Red4, 0, 1);
	        grid.add(Red5, 1, 1);
	        grid.add(Red6, 2, 1);
	        grid.add(Red7, 0, 2);
	        grid.add(Red8, 1, 2);
	        grid.add(Red9, 2, 2);
	         
	        Red. setVisible(false);
	        Red2.setVisible(false);
	        Red3.setVisible(false);
	        Red4.setVisible(false);
	        Red5.setVisible(false);
	        Red6.setVisible(false);
	        Red7.setVisible(false);
	        Red8.setVisible(false);
	        Red9.setVisible(false);
	        
	        TopL.setStyle("-fx-background-color: #00FF00");
	        TopC.setStyle("-fx-background-color: #00FF00");
	        TopR.setStyle("-fx-background-color: #00FF00");
	        MidL.setStyle("-fx-background-color: #00FF00");
	        MidC.setStyle("-fx-background-color: #00FF00");
	        MidR.setStyle("-fx-background-color: #00FF00");
	        BotL.setStyle("-fx-background-color: #00FF00");
	        BotC.setStyle("-fx-background-color: #00FF00");
	        BotR.setStyle("-fx-background-color: #00FF00");
	        
	        
	        Restart.setMinSize(105, 85);   
	        Restart.setStyle("-fx-background-color: #00FFFF");        
	        grid.add(Restart, 1, 1);
	    	Restart.setVisible(false);
	    	
	    	
	    	NextLevel.setMinSize(105, 85);
	        NextLevel.setStyle("-fx-background-color:  #191970; -fx-text-fill:  #FAEBD7");
	        grid.add(NextLevel, 1, 1);
	    	NextLevel.setVisible(false);
	        
	        //Random Width
	        for(int i = 0; i < storeW.length; i++) {	
	          storeW[i] = (int)(Math.random()*3);
	        }

	        //Random Height
	        for(int i = 0; i < storeH.length; i++) {
	          storeH[i] = (int)(Math.random()*3); 
	        }
	        
	        
	        startButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	            	
	    	        TopL.setDisable(true);
	    		    TopC.setDisable(true);
	    		    TopR.setDisable(true);
	    		    MidL.setDisable(true);
	    		    MidC.setDisable(true);
	    		    MidR.setDisable(true);
	    		    BotL.setDisable(true);
	    		    BotC.setDisable(true);
	    		    BotR.setDisable(true);
	    	        
	    	        Red.setDisable(true);
	    			Red2.setDisable(true);
	    			Red3.setDisable(true);
	    			Red4.setDisable(true);
	    			Red5.setDisable(true);
	    			Red6.setDisable(true);
	    			Red7.setDisable(true);
	    			Red8.setDisable(true);
	    			Red9.setDisable(true);
	            	
	            	primaryStage.setScene(scene);
	            	
	            	ButtonClicks = 0;
	            	for(int i = 0; i < 3;i++){
	    	        	
	            		if((storeW[i]== 0) && (storeH[i]== 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
	    	    	            	
	            					Red.setVisible(true);
	    	    	        		
	    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red);
	    	    	    	        ft.setFromValue(1);
	    	    	    	        ft.setToValue(0);
	    	    	    	        ft.play();
	    	    	    	 
	            			}));   
	            			
	            			tl.setCycleCount(1);
	                		tl.play();
	                		Red.setVisible(false);
	                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	    	            	
            					Red2.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red2);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red2.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 0)){
	            			
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	    	            	
            					Red3.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red3);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red3.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	    	            	
            					Red4.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red4);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red4.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 1)){
	    	    	       
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	    	            	
            					Red5.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red5);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red5.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	    	            	
            					Red6.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red6);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red6.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	    	            	
            					Red7.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red7);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red7.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	    	            	
            					Red8.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red8);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red8.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
	            				
            					Red9.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red9);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red9.setVisible(false);
	    	    	        
	            		}
	            		
	            		if(i==2){
	            	    	
	            	    	Timeline tl = new Timeline(new KeyFrame(Duration.millis(6000), e1 -> {
	            	    		
	            	    		Ready.setDisable(false);
	            	    		
	            	    	}));   
	            	    	
	            	    	tl.setCycleCount(1);
	            	    	tl.play();
	            		}
	            		
	            	}
	            	//End of For loop
	            	
	            }
	        });
	        //End of startButton ActionEvent
	        
	        
	        
	        //ButtonClicks
	        Red.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    	        		
    	        		FadeTransition ft = new FadeTransition(Duration.millis(250), TopL);
    	    	        ft.setFromValue(1);
    	    	        ft.setToValue(0);
    	    	        ft.play(); 
    	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopL);
    	    	        ft1.setFromValue(0);
    	    	        ft1.setToValue(1);
    	    	        ft1.play(); 
    	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[ButtonClicks-1]);
    		        
    				if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevel.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restart.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restart.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restart.setVisible(true);
    		        }
    		        
    			}
    		});
	        Red2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopC);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopC);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevel.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restart.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restart.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restart.setVisible(true);
    		        }
    			}
    		});
	        Red3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopR);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopR);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevel.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restart.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restart.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restart.setVisible(true);
    		        }
    			}
    		});
	        Red4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidL);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidL);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevel.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restart.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restart.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restart.setVisible(true);
    		        }
    			}
    		});
	        Red5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidC);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	   				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidC);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevel.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restart.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restart.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restart.setVisible(true);
    		        }
    			}
    		});
	        Red6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidR);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidR);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevel.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restart.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restart.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restart.setVisible(true);
    		        }
    			}
    		});
	        Red7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotL);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotL);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevel.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restart.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restart.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restart.setVisible(true);
    		        }
    			}
    		});
	        Red8.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotC);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotC);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevel.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restart.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restart.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restart.setVisible(true);
    		        }
    			}
    		});
	        Red9.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotR);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotR);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevel.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restart.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restart.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restart.setVisible(true);
    		        }
    			}
    		});
	        
			
	        //ReadyButton makes Red Buttons disabled while not clicked
	        Ready.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				TopL.setDisable(false);
    			    TopC.setDisable(false);
    			    TopR.setDisable(false);
    			    MidL.setDisable(false);
    			    MidC.setDisable(false);
    			    MidR.setDisable(false);
    			    BotL.setDisable(false);
    			    BotC.setDisable(false);
    			    BotR.setDisable(false);
    				
    				Red.setDisable(false);
    				Red2.setDisable(false);
    				Red3.setDisable(false);
    				Red4.setDisable(false);
    				Red5.setDisable(false);
    				Red6.setDisable(false);
    				Red7.setDisable(false);
    				Red8.setDisable(false);
    				Red9.setDisable(false);
    				Ready.setDisable(true);
    				
    				
    			}
    		});
	        
	        
	        //RESTART
	        TopL.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restart.setVisible(true);
    				System.out.println("Restart");
    				
    			}
    		});
	        TopC.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restart.setVisible(true);
    				System.out.println("Restart");
		   		 
    			}
    		});
	        TopR.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restart.setVisible(true);
    				System.out.println("Restart");
 
    			}
    		});
	        MidL.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restart.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidC.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restart.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidR.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restart.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotL.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restart.setVisible(true);
    				System.out.println("Restart");
    			}
    		});
	        BotC.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restart.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotR.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restart.setVisible(true);   
    				System.out.println("Restart");
    				
    			}
    		});
	        
	        
	        
	        //Restart Button
	        Restart.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				primaryStage.setScene(start);
    				//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
    				Restart.setVisible(false);
    				Ready.setDisable(true);
    			}
    		});
	        


	        //LEVEL 2
	        
	        //Level 2 Start screen
	        GridPane startl2 = createGrid();
	        BorderPane rootl2 = new BorderPane();
	        rootl2.setPadding(new Insets(10));
	        rootl2.setCenter(startl2);
	        Scene startlevel2 = new Scene(rootl2, 365, 300);
	        
	        //Level 2 Game
	        GridPane gridl2 = createGrid();
	        BorderPane rootl22 = new BorderPane();
	        rootl22.setPadding(new Insets(10));
	        rootl22.setCenter(gridl2);
	        Scene level2 = new Scene(rootl22, 365, 350);
	        
	        Button startButtonl2 = new Button("START\nLevel 2");
			Button Restartl2 = new Button("RESTART");
			Button NextLevell2 = new Button("NEXT\nLEVEL");
			Button exitl2 = new Button("EXIT");
	    	
	    	startButtonl2.setMinHeight(50);
	    	startButtonl2.setMinWidth(100);
	    	
	    	exitl2.setMinHeight(50);
	    	exitl2.setMinWidth(100);
	    	
	    	Restartl2.setMinHeight(50);
	    	Restartl2.setMinWidth(100);
	    	
	    	exitl2.setMinHeight(50);
	    	exitl2.setMinWidth(100);
	    	
	    	NextLevell2.setMinHeight(50);
	    	NextLevell2.setMinWidth(100);
	    	
	    	startl2.add(startButtonl2, 0, 0);
	    	startl2.add(exitl2, 0, 1);
	    	 
	    	
	        //show level 2 start screen
	        NextLevel.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					primaryStage.setScene(startlevel2);
    					NextLevel.setVisible(false);
    			}
    		});
	        
	        
	        //Level 2 Game
	        Button Readyl2 = new Button("Ready");
	    	Readyl2.setMinSize(100, 50);
	    	gridl2.add(Readyl2,1,3);
	    	Readyl2.setDisable(true);

	        Button TopLl2 = new Button("");
	        Button TopCl2 = new Button("");
	        Button TopRl2 = new Button("");
	        Button MidLl2 = new Button("");
	        Button MidCl2 = new Button("");
	        Button MidRl2 = new Button("");
	        Button BotLl2 = new Button("");
	        Button BotCl2 = new Button("");
	        Button BotRl2 = new Button("");
	        
	        Button Redl2 = new Button("");
	        Button Red2l2 = new Button("");
	        Button Red3l2 = new Button("");
	        Button Red4l2 = new Button("");
	        Button Red5l2 = new Button("");
	        Button Red6l2 = new Button("");
	        Button Red7l2 = new Button("");
	        Button Red8l2 = new Button("");
	        Button Red9l2 = new Button("");
	        
	        Redl2.setStyle ("-fx-background-color: #FF0000");
	        Red2l2.setStyle("-fx-background-color: #FF0000");
	        Red3l2.setStyle("-fx-background-color: #FF0000");
	        Red4l2.setStyle("-fx-background-color: #FF0000");
	        Red5l2.setStyle("-fx-background-color: #FF0000");
	        Red6l2.setStyle("-fx-background-color: #FF0000");
	        Red7l2.setStyle("-fx-background-color: #FF0000");
	        Red8l2.setStyle("-fx-background-color: #FF0000");
	        Red9l2.setStyle("-fx-background-color: #FF0000");
	        
	        Redl2.setMinSize(105, 85);
	        Red2l2.setMinSize(105, 85);
	        Red3l2.setMinSize(105, 85);
	        Red4l2.setMinSize(105, 85);
	        Red5l2.setMinSize(105, 85);
	        Red6l2.setMinSize(105, 85);
	        Red7l2.setMinSize(105, 85);
	        Red8l2.setMinSize(105, 85);
	        Red9l2.setMinSize(105, 85);
	        
	        TopLl2.setMinSize(105, 85);
	        TopCl2.setMinSize(105, 85);
	        TopRl2.setMinSize(105, 85);
	        MidLl2.setMinSize(105, 85);
	        MidCl2.setMinSize(105, 85);
	        MidRl2.setMinSize(105, 85);
	        BotLl2.setMinSize(105, 85);
	        BotCl2.setMinSize(105, 85);
	        BotRl2.setMinSize(105, 85);
	        
	        gridl2.add(TopLl2, 0, 0);
	        gridl2.add(TopCl2, 1, 0);
	        gridl2.add(TopRl2, 2, 0);
	        gridl2.add(MidLl2, 0, 1);
	        gridl2.add(MidCl2, 1, 1);
	        gridl2.add(MidRl2, 2, 1);
	        gridl2.add(BotLl2, 0, 2);
	        gridl2.add(BotCl2, 1, 2);
	        gridl2.add(BotRl2, 2, 2);
	        
	        gridl2.add(Redl2,  0, 0);
	        gridl2.add(Red2l2, 1, 0);
	        gridl2.add(Red3l2, 2, 0);
	        gridl2.add(Red4l2, 0, 1);
	        gridl2.add(Red5l2, 1, 1);
	        gridl2.add(Red6l2, 2, 1);
	        gridl2.add(Red7l2, 0, 2);
	        gridl2.add(Red8l2, 1, 2);
	        gridl2.add(Red9l2, 2, 2);
	         
	        Redl2. setVisible(false);
	        Red2l2.setVisible(false);
	        Red3l2.setVisible(false);
	        Red4l2.setVisible(false);
	        Red5l2.setVisible(false);
	        Red6l2.setVisible(false);
	        Red7l2.setVisible(false);
	        Red8l2.setVisible(false);
	        Red9l2.setVisible(false);
	        
	        TopLl2.setStyle("-fx-background-color: #00FF00");
	        TopCl2.setStyle("-fx-background-color: #00FF00");
	        TopRl2.setStyle("-fx-background-color: #00FF00");
	        MidLl2.setStyle("-fx-background-color: #00FF00");
	        MidCl2.setStyle("-fx-background-color: #00FF00");
	        MidRl2.setStyle("-fx-background-color: #00FF00");
	        BotLl2.setStyle("-fx-background-color: #00FF00");
	        BotCl2.setStyle("-fx-background-color: #00FF00");
	        BotRl2.setStyle("-fx-background-color: #00FF00");
	        
	        
	        Restartl2.setMinSize(105, 85);   
	        Restartl2.setStyle("-fx-background-color: #00FFFF");        
	        gridl2.add(Restartl2, 1, 1);
	    	Restartl2.setVisible(false);
	    	
	    	NextLevell2.setMinSize(105, 85);
	        NextLevell2.setStyle("-fx-background-color:  #191970; -fx-text-fill:  #FAEBD7");
	        gridl2.add(NextLevell2, 1, 1);
	    	NextLevell2.setVisible(false);
	        
	        
	        //show level 2 game
	      
	    	startButtonl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    		        TopLl2.setDisable(true);
    			    TopCl2.setDisable(true);
    			    TopRl2.setDisable(true);
    			    MidLl2.setDisable(true);
    			    MidCl2.setDisable(true);
    			    MidRl2.setDisable(true);
    			    BotLl2.setDisable(true);
    			    BotCl2.setDisable(true);
    			    BotRl2.setDisable(true);
    		        
    		        Redl2.setDisable(true);
    				Red2l2.setDisable(true);
    				Red3l2.setDisable(true);
    				Red4l2.setDisable(true);
    				Red5l2.setDisable(true);
    				Red6l2.setDisable(true);
    				Red7l2.setDisable(true);
    				Red8l2.setDisable(true);
    				Red9l2.setDisable(true);
    				
    					ButtonClicks = 0;
    					primaryStage.setScene(level2);
    					
    					//Random Width
    			        for(int i = 0; i < storeW.length; i++) {	
    			          storeW[i] = (int)(Math.random()*3);
    			        }

    			        //Random Height
    			        for(int i = 0; i < storeH.length; i++) {
    			          storeH[i] = (int)(Math.random()*3); 
    			        }
    					
    		           	for(int i = 0; i < 4;i++){
    	    	        	
    	            		if((storeW[i]== 0) && (storeH[i]== 0)){

    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	    	    	            	
    	            					Redl2.setVisible(true);
    	    	    	        		
    	    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Redl2);
    	    	    	    	        ft.setFromValue(1);
    	    	    	    	        ft.setToValue(0);
    	    	    	    	        ft.play();
    	    	    	    	 
    	            			}));   
    	            			
    	            			tl.setCycleCount(1);
    	                		tl.play();
    	                		Redl2.setVisible(false);
    	                		
    	    	        	}
    	            		else if((storeW[i] == 1) && (storeH[i] == 0)){

    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red2l2.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red2l2);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red2l2.setVisible(false);
                    		
    	    	        	}
    	            		else if((storeW[i] == 2) && (storeH[i] == 0)){
    	            			
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red3l2.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red3l2);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red3l2.setVisible(false);

    	    	        	}
    	            		else if((storeW[i] == 0) && (storeH[i] == 1)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red4l2.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red4l2);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red4l2.setVisible(false);
                    		
    	    	        	}
    	            		else if((storeW[i] == 1) && (storeH[i] == 1)){
    	    	    	       
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red5l2.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red5l2);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red5l2.setVisible(false);
                    		
    	    	        	}
    	            		else if((storeW[i] == 2) && (storeH[i] == 1)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red6l2.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red6l2);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red6l2.setVisible(false);

    	    	        	}
    	            		else if((storeW[i] == 0) && (storeH[i] == 2)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red7l2.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red7l2);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red7l2.setVisible(false);

    	    	        	}
    	            		else if((storeW[i] == 1) && (storeH[i] == 2)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red8l2.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red8l2);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red8l2.setVisible(false);

    	    	        	}
    	            		else if((storeW[i] == 2) && (storeH[i] == 2)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	            				
                					Red9l2.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red9l2);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red9l2.setVisible(false);
    	    	    	        
    	            		}
    	            		
    	            		if(i==2){
    	            	    	
    	            	    	Timeline tl = new Timeline(new KeyFrame(Duration.millis(7000), e1 -> {
    	            	    		
    	            	    		Readyl2.setDisable(false);
    	            	    		
    	            	    	}));   
    	            	    	
    	            	    	tl.setCycleCount(1);
    	            	    	tl.play();
    	            		}
    	            		
    	            	}
    	            	//End of For loop
    					
    		           	
    		           	
    					
    					
    			}
    		});
	       
	        
	        
	    	//ButtonClicks
	        Redl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopLl2);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopLl2);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[ButtonClicks-1]);
    		        
    				if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        	NextLevell2.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl2.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl2.setVisible(true);
    		        }
    		        
    			}
    		});
	        Red2l2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopCl2);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopCl2);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        	NextLevell2.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl2.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl2.setVisible(true);
    		        }
    			}
    		});
	        Red3l2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopRl2);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopRl2);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		  
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        	NextLevell2.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl2.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl2.setVisible(true);
    		        }
    			}
    		});
	        Red4l2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidLl2);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidLl2);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        	NextLevell2.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl2.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl2.setVisible(true);
    		        }
    			}
    		});
	        Red5l2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidCl2);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidCl2);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        	NextLevell2.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl2.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl2.setVisible(true);
    		        }
    			}
    		});
	        Red6l2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidRl2);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidRl2);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        	NextLevell2.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl2.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl2.setVisible(true);
    		        }
    			}
    		});
	        Red7l2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotLl2);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotLl2);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        	NextLevell2.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl2.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl2.setVisible(true);
    		        }
    			}
    		});
	        Red8l2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotCl2);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotCl2);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        	NextLevell2.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl2.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl2.setVisible(true);
    		        }
    			}
    		});
	        Red9l2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotRl2);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotRl2);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        	NextLevell2.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl2.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl2.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl2.setVisible(true);
    		        }
    		        
    			}
    		});

	        
	        //ReadyButton makes Red Buttons disabled while not clicked
	        Readyl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					
    				TopLl2.setDisable(false);
    			    TopCl2.setDisable(false);
    			    TopRl2.setDisable(false);
    			    MidLl2.setDisable(false);
    			    MidCl2.setDisable(false);
    			    MidRl2.setDisable(false);
    			    BotLl2.setDisable(false);
    			    BotCl2.setDisable(false);
    			    BotRl2.setDisable(false);
    				
    				Redl2.setDisable(false);
    				Red2l2.setDisable(false);
    				Red3l2.setDisable(false);
    				Red4l2.setDisable(false);
    				Red5l2.setDisable(false);
    				Red6l2.setDisable(false);
    				Red7l2.setDisable(false);
    				Red8l2.setDisable(false);
    				Red9l2.setDisable(false);
    				Readyl2.setDisable(true);
    			}
    		});
	        
	        
	        //RESTART
	        TopLl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl2.setVisible(true);
    				System.out.println("Restart");
    				
    			}
    		});
	        TopCl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl2.setVisible(true);
    				System.out.println("Restart");
		   		 
    			}
    		});
	        TopRl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl2.setVisible(true);
    				System.out.println("Restart");
 
    			}
    		});
	        MidLl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl2.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidCl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl2.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidRl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl2.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotLl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl2.setVisible(true);
    				System.out.println("Restart");
    			}
    		});
	        BotCl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl2.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotRl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl2.setVisible(true);   
    				System.out.println("Restart");
    				
    			}
    		});
	        
	        
	        
	        //Restart Button
	        Restartl2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				primaryStage.setScene(start);
    				//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
    				Restartl2.setVisible(false);
    				Readyl2.setDisable(true);
    			}
    		});

	        
	        
	        
	        
	        //LEVEL 3
	        
	        //Level 3 Start screen
	        GridPane startl3 = createGrid();
	        BorderPane rootl3 = new BorderPane();
	        rootl3.setPadding(new Insets(10));
	        rootl3.setCenter(startl3);
	        Scene startlevel3 = new Scene(rootl3, 365, 300);
	        
	        //Level 3 Game
	        GridPane gridl3 = createGrid();
	        BorderPane rootl32 = new BorderPane();
	        rootl32.setPadding(new Insets(10));
	        rootl32.setCenter(gridl3);
	        Scene level3 = new Scene(rootl32, 365, 350);
	        
	        Button startButtonl3 = new Button("START\nLevel 3");
			Button Restartl3 = new Button("RESTART");
			Button NextLevell3 = new Button("NEXT\nLEVEL");
			Button exitl3 = new Button("EXIT");
	    	
	    	startButtonl3.setMinHeight(50);
	    	startButtonl3.setMinWidth(100);
	    	
	    	exitl3.setMinHeight(50);
	    	exitl3.setMinWidth(100);
	    	
	    	Restartl3.setMinHeight(50);
	    	Restartl3.setMinWidth(100);
	    	
	    	exitl3.setMinHeight(50);
	    	exitl3.setMinWidth(100);
	    	
	    	NextLevell3.setMinHeight(50);
	    	NextLevell3.setMinWidth(100);
	    	
	    	startl3.add(startButtonl3, 0, 0);
	    	startl3.add(exitl3, 0, 1);
	    	 
	    	
	        //show level 3 start screen
	        NextLevell2.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					primaryStage.setScene(startlevel3);
    					NextLevell2.setVisible(false);
    			}
    		});
	        
	        
	        //Level 3 Game
	        Button Readyl3 = new Button("Ready");
	    	Readyl3.setMinSize(100, 50);
	    	gridl3.add(Readyl3,1,3);
	    	Readyl3.setDisable(true);

	        Button TopLl3 = new Button("");
	        Button TopCl3 = new Button("");
	        Button TopRl3 = new Button("");
	        Button MidLl3 = new Button("");
	        Button MidCl3 = new Button("");
	        Button MidRl3 = new Button("");
	        Button BotLl3 = new Button("");
	        Button BotCl3 = new Button("");
	        Button BotRl3 = new Button("");
	        
	        Button Redl3 = new Button("");
	        Button Red2l3 = new Button("");
	        Button Red3l3 = new Button("");
	        Button Red4l3 = new Button("");
	        Button Red5l3 = new Button("");
	        Button Red6l3 = new Button("");
	        Button Red7l3 = new Button("");
	        Button Red8l3 = new Button("");
	        Button Red9l3 = new Button("");
	        
	        Redl3.setStyle ("-fx-background-color: #FF0000");
	        Red2l3.setStyle("-fx-background-color: #FF0000");
	        Red3l3.setStyle("-fx-background-color: #FF0000");
	        Red4l3.setStyle("-fx-background-color: #FF0000");
	        Red5l3.setStyle("-fx-background-color: #FF0000");
	        Red6l3.setStyle("-fx-background-color: #FF0000");
	        Red7l3.setStyle("-fx-background-color: #FF0000");
	        Red8l3.setStyle("-fx-background-color: #FF0000");
	        Red9l3.setStyle("-fx-background-color: #FF0000");
	        
	        Redl3.setMinSize(105, 85);
	        Red2l3.setMinSize(105, 85);
	        Red3l3.setMinSize(105, 85);
	        Red4l3.setMinSize(105, 85);
	        Red5l3.setMinSize(105, 85);
	        Red6l3.setMinSize(105, 85);
	        Red7l3.setMinSize(105, 85);
	        Red8l3.setMinSize(105, 85);
	        Red9l3.setMinSize(105, 85);
	        
	        TopLl3.setMinSize(105, 85);
	        TopCl3.setMinSize(105, 85);
	        TopRl3.setMinSize(105, 85);
	        MidLl3.setMinSize(105, 85);
	        MidCl3.setMinSize(105, 85);
	        MidRl3.setMinSize(105, 85);
	        BotLl3.setMinSize(105, 85);
	        BotCl3.setMinSize(105, 85);
	        BotRl3.setMinSize(105, 85);
	        
	        gridl3.add(TopLl3, 0, 0);
	        gridl3.add(TopCl3, 1, 0);
	        gridl3.add(TopRl3, 2, 0);
	        gridl3.add(MidLl3, 0, 1);
	        gridl3.add(MidCl3, 1, 1);
	        gridl3.add(MidRl3, 2, 1);
	        gridl3.add(BotLl3, 0, 2);
	        gridl3.add(BotCl3, 1, 2);
	        gridl3.add(BotRl3, 2, 2);
	        
	        gridl3.add(Redl3,  0, 0);
	        gridl3.add(Red2l3, 1, 0);
	        gridl3.add(Red3l3, 2, 0);
	        gridl3.add(Red4l3, 0, 1);
	        gridl3.add(Red5l3, 1, 1);
	        gridl3.add(Red6l3, 2, 1);
	        gridl3.add(Red7l3, 0, 2);
	        gridl3.add(Red8l3, 1, 2);
	        gridl3.add(Red9l3, 2, 2);
	         
	        Redl3. setVisible(false);
	        Red2l3.setVisible(false);
	        Red3l3.setVisible(false);
	        Red4l3.setVisible(false);
	        Red5l3.setVisible(false);
	        Red6l3.setVisible(false);
	        Red7l3.setVisible(false);
	        Red8l3.setVisible(false);
	        Red9l3.setVisible(false);
	        
	        TopLl3.setStyle("-fx-background-color: #00FF00");
	        TopCl3.setStyle("-fx-background-color: #00FF00");
	        TopRl3.setStyle("-fx-background-color: #00FF00");
	        MidLl3.setStyle("-fx-background-color: #00FF00");
	        MidCl3.setStyle("-fx-background-color: #00FF00");
	        MidRl3.setStyle("-fx-background-color: #00FF00");
	        BotLl3.setStyle("-fx-background-color: #00FF00");
	        BotCl3.setStyle("-fx-background-color: #00FF00");
	        BotRl3.setStyle("-fx-background-color: #00FF00");
	        
	        
	        Restartl3.setMinSize(105, 85);   
	        Restartl3.setStyle("-fx-background-color: #00FFFF");        
	        gridl3.add(Restartl3, 1, 1);
	    	Restartl3.setVisible(false);
	    	
	    	NextLevell3.setMinSize(105, 85);
	        NextLevell3.setStyle("-fx-background-color:  #191970; -fx-text-fill:  #FAEBD7");
	        gridl3.add(NextLevell3, 1, 1);
	    	NextLevell3.setVisible(false);
	        
	        
	        //show level 2 game
	      
	    	startButtonl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    		        TopLl3.setDisable(true);
    			    TopCl3.setDisable(true);
    			    TopRl3.setDisable(true);
    			    MidLl3.setDisable(true);
    			    MidCl3.setDisable(true);
    			    MidRl3.setDisable(true);
    			    BotLl3.setDisable(true);
    			    BotCl3.setDisable(true);
    			    BotRl3.setDisable(true);
    		        
    		        Redl3.setDisable(true);
    				Red2l3.setDisable(true);
    				Red3l3.setDisable(true);
    				Red4l3.setDisable(true);
    				Red5l3.setDisable(true);
    				Red6l3.setDisable(true);
    				Red7l3.setDisable(true);
    				Red8l3.setDisable(true);
    				Red9l3.setDisable(true);
    				
    					ButtonClicks = 0;
    					primaryStage.setScene(level3);
    					
    					//Random Width
    			        for(int i = 0; i < storeW.length; i++) {	
    			          storeW[i] = (int)(Math.random()*3);
    			        }

    			        //Random Height
    			        for(int i = 0; i < storeH.length; i++) {
    			          storeH[i] = (int)(Math.random()*3); 
    			        }
    					
    		           	for(int i = 0; i < 5;i++){
    	    	        	
    	            		if((storeW[i]== 0) && (storeH[i]== 0)){

    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	    	    	            	
    	            					Redl3.setVisible(true);
    	    	    	        		
    	    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Redl3);
    	    	    	    	        ft.setFromValue(1);
    	    	    	    	        ft.setToValue(0);
    	    	    	    	        ft.play();
    	    	    	    	 
    	            			}));   
    	            			
    	            			tl.setCycleCount(1);
    	                		tl.play();
    	                		Redl3.setVisible(false);
    	                		
    	    	        	}
    	            		else if((storeW[i] == 1) && (storeH[i] == 0)){

    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red2l3.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red2l3);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red2l3.setVisible(false);
                    		
    	    	        	}
    	            		else if((storeW[i] == 2) && (storeH[i] == 0)){
    	            			
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red3l3.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red3l3);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red3l3.setVisible(false);

    	    	        	}
    	            		else if((storeW[i] == 0) && (storeH[i] == 1)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red4l3.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red4l3);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red4l3.setVisible(false);
                    		
    	    	        	}
    	            		else if((storeW[i] == 1) && (storeH[i] == 1)){
    	    	    	       
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red5l3.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red5l3);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red5l3.setVisible(false);
                    		
    	    	        	}
    	            		else if((storeW[i] == 2) && (storeH[i] == 1)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red6l3.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red6l3);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red6l3.setVisible(false);

    	    	        	}
    	            		else if((storeW[i] == 0) && (storeH[i] == 2)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red7l3.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red7l3);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red7l3.setVisible(false);

    	    	        	}
    	            		else if((storeW[i] == 1) && (storeH[i] == 2)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
        	    	            	
                					Red8l3.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red8l3);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red8l3.setVisible(false);

    	    	        	}
    	            		else if((storeW[i] == 2) && (storeH[i] == 2)){
    	    		        	
    	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*1500), e1 -> {
    	            				
                					Red9l3.setVisible(true);
        	    	        		
        	    	        		FadeTransition ft = new FadeTransition(Duration.millis(1500), Red9l3);
        	    	    	        ft.setFromValue(1);
        	    	    	        ft.setToValue(0);
        	    	    	        ft.play();
        	    	    	 
                			}));   
                			
                			tl.setCycleCount(1);
                    		tl.play();
                    		Red9l3.setVisible(false);
    	    	    	        
    	            		}
    	            		
    	            		if(i==2){
    	            	    	
    	            	    	Timeline tl = new Timeline(new KeyFrame(Duration.millis(8500), e1 -> {
    	            	    		
    	            	    		Readyl3.setDisable(false);
    	            	    		
    	            	    	}));   
    	            	    	
    	            	    	tl.setCycleCount(1);
    	            	    	tl.play();
    	            		}
    	            		
    	            	}
    	            	//End of For loop
    					
    		           	
    		           	
    					
    					
    			}
    		});
	       
	        
	        
	    	//ButtonClicks
	        Redl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopLl3);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopLl3);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[ButtonClicks-1]);
    		        
    				if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	System.out.println("5: Correct");
    		        	NextLevell3.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl3.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl3.setVisible(true);
    		        }
    		        
    			}
    		});
	        Red2l3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopCl3);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopCl3);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell3.setVisible(true);
    		        	System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl3.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl3.setVisible(true);
    		        }
    			}
    		});
	        Red3l3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopRl3);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopRl3);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	System.out.println("5: Correct");
    		        	NextLevell3.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl3.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl3.setVisible(true);
    		        }
    			}
    		});
	        Red4l3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidLl3);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidLl3);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	System.out.println("5: Correct");
    		        	NextLevell3.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl3.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl3.setVisible(true);
    		        }
    			}
    		});
	        Red5l3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidCl3);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidCl3);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	System.out.println("5: Correct");
    		        	NextLevell3.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl3.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl3.setVisible(true);
    		        }
    			}
    		});
	        Red6l3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidRl3);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidRl3);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	System.out.println("5: Correct");
    		        	NextLevell3.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl3.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl3.setVisible(true);
    		        }
    			}
    		});
	        Red7l3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotLl3);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotLl3);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	System.out.println("5: Correct");
    		        	NextLevell3.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl3.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl3.setVisible(true);
    		        }
    			}
    		});
	        Red8l3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotCl3);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotCl3);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	System.out.println("5: Correct");
    		        	NextLevell3.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl3.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl3.setVisible(true);
    		        }
    			}
    		});
	        Red9l3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotRl3);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotRl3);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	System.out.println("5: Correct");
    		        	NextLevell3.setVisible(true);
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl3.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl3.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl3.setVisible(true);
    		        }
    		        
    			}
    		});

	        
	        //ReadyButton makes Buttons disabled while not clicked
	        Readyl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					
    				TopLl3.setDisable(false);
    			    TopCl3.setDisable(false);
    			    TopRl3.setDisable(false);
    			    MidLl3.setDisable(false);
    			    MidCl3.setDisable(false);
    			    MidRl3.setDisable(false);
    			    BotLl3.setDisable(false);
    			    BotCl3.setDisable(false);
    			    BotRl3.setDisable(false);
    				
    				Redl3.setDisable(false);
    				Red2l3.setDisable(false);
    				Red3l3.setDisable(false);
    				Red4l3.setDisable(false);
    				Red5l3.setDisable(false);
    				Red6l3.setDisable(false);
    				Red7l3.setDisable(false);
    				Red8l3.setDisable(false);
    				Red9l3.setDisable(false);
    				Readyl3.setDisable(true);
    			}
    		});
	        
	        
	        //RESTART
	        TopLl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl3.setVisible(true);
    				System.out.println("Restart");
    				
    			}
    		});
	        TopCl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl3.setVisible(true);
    				System.out.println("Restart");
		   		 
    			}
    		});
	        TopRl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl3.setVisible(true);
    				System.out.println("Restart");
 
    			}
    		});
	        MidLl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl3.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidCl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl3.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidRl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl3.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotLl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl3.setVisible(true);
    				System.out.println("Restart");
    			}
    		});
	        BotCl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl3.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotRl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl3.setVisible(true);   
    				System.out.println("Restart");
    				
    			}
    		});
	        
	        
	        
	        //Restart Button
	        Restartl3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				primaryStage.setScene(start);
    				//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
    				Restartl3.setVisible(false);
    				Readyl3.setDisable(true);
    			}
    		});
	        
	        
	        
	        
	        //LEVEL 4
	        
	        
	        
	      //Level 4 Start screen
	        GridPane startl4 = createGrid();
	        BorderPane rootl4 = new BorderPane();
	        rootl4.setPadding(new Insets(10));
	        rootl4.setCenter(startl4);
	        Scene startlevel4 = new Scene(rootl4, 365, 300);
	        
	        //Level 4 Game
	        GridPane gridl4 = createGrid();
	        BorderPane rootl42 = new BorderPane();
	        rootl42.setPadding(new Insets(10));
	        rootl42.setCenter(gridl4);
	        Scene level4 = new Scene(rootl42, 365, 350);
	        
	        Button startButtonl4 = new Button("START\nLevel 4");
			Button Restartl4 = new Button("RESTART");
			Button NextLevell4 = new Button("NEXT\nLEVEL");
			Button exitl4 = new Button("EXIT");
	    	
	    	startButtonl4.setMinHeight(50);
	    	startButtonl4.setMinWidth(100);
	    	
	    	exitl4.setMinHeight(50);
	    	exitl4.setMinWidth(100);
	    	
	    	Restartl4.setMinHeight(50);
	    	Restartl4.setMinWidth(100);
	    	
	    	exitl4.setMinHeight(50);
	    	exitl4.setMinWidth(100);
	    	
	    	NextLevell4.setMinHeight(50);
	    	NextLevell4.setMinWidth(100);
	    	
	    	startl4.add(startButtonl4, 0, 0);
	    	startl4.add(exitl4, 0, 1);
	    	
	        //show level 4 start screen
	        NextLevell3.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					primaryStage.setScene(startlevel4);
    					NextLevell3.setVisible(false);
    			}
    		});
	        
	        
	        exitl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					System.exit(0);
    			}
    		});
	        
	    	
	    	//
	    	//Game
	    	//
	    	
	    	Button Readyl4 = new Button("Ready");
	    	Readyl4.setMinSize(100, 50);
	    	gridl4.add(Readyl4,1,3);
	    	Readyl4.setDisable(true);

	        Button TopLl4 = new Button("");
	        Button TopCl4 = new Button("");
	        Button TopRl4 = new Button("");
	        Button MidLl4 = new Button("");
	        Button MidCl4 = new Button("");
	        Button MidRl4 = new Button("");
	        Button BotLl4 = new Button("");
	        Button BotCl4 = new Button("");
	        Button BotRl4 = new Button("");
	        
	        Button Redl4 = new Button("");
	        Button Red2l4 = new Button("");
	        Button Red3l4 = new Button("");
	        Button Red4l4 = new Button("");
	        Button Red5l4 = new Button("");
	        Button Red6l4 = new Button("");
	        Button Red7l4 = new Button("");
	        Button Red8l4 = new Button("");
	        Button Red9l4 = new Button("");
	        
	        Redl4.setStyle ("-fx-background-color: #FF0000");
	        Red2l4.setStyle("-fx-background-color: #FF0000");
	        Red3l4.setStyle("-fx-background-color: #FF0000");
	        Red4l4.setStyle("-fx-background-color: #FF0000");
	        Red5l4.setStyle("-fx-background-color: #FF0000");
	        Red6l4.setStyle("-fx-background-color: #FF0000");
	        Red7l4.setStyle("-fx-background-color: #FF0000");
	        Red8l4.setStyle("-fx-background-color: #FF0000");
	        Red9l4.setStyle("-fx-background-color: #FF0000");
	        
	        Redl4.setMinSize(105, 85);
	        Red2l4.setMinSize(105, 85);
	        Red3l4.setMinSize(105, 85);
	        Red4l4.setMinSize(105, 85);
	        Red5l4.setMinSize(105, 85);
	        Red6l4.setMinSize(105, 85);
	        Red7l4.setMinSize(105, 85);
	        Red8l4.setMinSize(105, 85);
	        Red9l4.setMinSize(105, 85);
	        
	        TopLl4.setMinSize(105, 85);
	        TopCl4.setMinSize(105, 85);
	        TopRl4.setMinSize(105, 85);
	        MidLl4.setMinSize(105, 85);
	        MidCl4.setMinSize(105, 85);
	        MidRl4.setMinSize(105, 85);
	        BotLl4.setMinSize(105, 85);
	        BotCl4.setMinSize(105, 85);
	        BotRl4.setMinSize(105, 85);
	        
	        gridl4.add(TopLl4, 0, 0);
	        gridl4.add(TopCl4, 1, 0);
	        gridl4.add(TopRl4, 2, 0);
	        gridl4.add(MidLl4, 0, 1);
	        gridl4.add(MidCl4, 1, 1);
	        gridl4.add(MidRl4, 2, 1);
	        gridl4.add(BotLl4, 0, 2);
	        gridl4.add(BotCl4, 1, 2);
	        gridl4.add(BotRl4, 2, 2);
	        
	        gridl4.add(Redl4,  0, 0);
	        gridl4.add(Red2l4, 1, 0);
	        gridl4.add(Red3l4, 2, 0);
	        gridl4.add(Red4l4, 0, 1);
	        gridl4.add(Red5l4, 1, 1);
	        gridl4.add(Red6l4, 2, 1);
	        gridl4.add(Red7l4, 0, 2);
	        gridl4.add(Red8l4, 1, 2);
	        gridl4.add(Red9l4, 2, 2);
	         
	        Redl4. setVisible(false);
	        Red2l4.setVisible(false);
	        Red3l4.setVisible(false);
	        Red4l4.setVisible(false);
	        Red5l4.setVisible(false);
	        Red6l4.setVisible(false);
	        Red7l4.setVisible(false);
	        Red8l4.setVisible(false);
	        Red9l4.setVisible(false);
	        
	        TopLl4.setStyle("-fx-background-color: #00FF00");
	        TopCl4.setStyle("-fx-background-color: #00FF00");
	        TopRl4.setStyle("-fx-background-color: #00FF00");
	        MidLl4.setStyle("-fx-background-color: #00FF00");
	        MidCl4.setStyle("-fx-background-color: #00FF00");
	        MidRl4.setStyle("-fx-background-color: #00FF00");
	        BotLl4.setStyle("-fx-background-color: #00FF00");
	        BotCl4.setStyle("-fx-background-color: #00FF00");
	        BotRl4.setStyle("-fx-background-color: #00FF00");
	        
	        
	        Restartl4.setMinSize(105, 85);   
	        Restartl4.setStyle("-fx-background-color: #00FFFF");        
	        gridl4.add(Restartl4, 1, 1);
	    	Restartl4.setVisible(false);
	    	
	    	NextLevell4.setMinSize(105, 85);
	        NextLevell4.setStyle("-fx-background-color:  #191970; -fx-text-fill:  #FAEBD7");
	        gridl4.add(NextLevell4, 1, 1);
	    	NextLevell4.setVisible(false);
	        
	        //Random Width
	        for(int i = 0; i < storeW.length; i++) {	
	          storeW[i] = (int)(Math.random()*3);
	        }

	        //Random Height
	        for(int i = 0; i < storeH.length; i++) {
	          storeH[i] = (int)(Math.random()*3); 
	        }
	        
	        
	        startButtonl4.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	            	
	            	//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
	            	
	    	        TopLl4.setDisable(true);
	    		    TopCl4.setDisable(true);
	    		    TopRl4.setDisable(true);
	    		    MidLl4.setDisable(true);
	    		    MidCl4.setDisable(true);
	    		    MidRl4.setDisable(true);
	    		    BotLl4.setDisable(true);
	    		    BotCl4.setDisable(true);
	    		    BotRl4.setDisable(true);
	    	        
	    	        Redl4.setDisable(true);
	    			Red2l4.setDisable(true);
	    			Red3l4.setDisable(true);
	    			Red4l4.setDisable(true);
	    			Red5l4.setDisable(true);
	    			Red6l4.setDisable(true);
	    			Red7l4.setDisable(true);
	    			Red8l4.setDisable(true);
	    			Red9l4.setDisable(true);
	            	
	            	primaryStage.setScene(level4);
	            	
	            	ButtonClicks = 0;
	            	for(int i = 0; i < 3;i++){
	    	        	
	            		if((storeW[i]== 0) && (storeH[i]== 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
	    	    	            	
	            					Redl4.setVisible(true);
	    	    	        		
	    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Redl4);
	    	    	    	        ft.setFromValue(1);
	    	    	    	        ft.setToValue(0);
	    	    	    	        ft.play();
	    	    	    	 
	            			}));   
	            			
	            			tl.setCycleCount(1);
	                		tl.play();
	                		Redl4.setVisible(false);
	                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red2l4.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red2l4);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red2l4.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 0)){
	            			
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red3l4.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red3l4);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red3l4.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red4l4.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red4l4);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red4l4.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 1)){
	    	    	       
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red5l4.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red5l4);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red5l4.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red6l4.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red6l4);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red6l4.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red7l4.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red7l4);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red7l4.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red8l4.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red8l4);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red8l4.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
	            				
            					Red9l4.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red9l4);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red9l4.setVisible(false);
	    	    	        
	            		}
	            		
	            		if(i==2){
	            	    	
	            	    	Timeline tl = new Timeline(new KeyFrame(Duration.millis(3200), e1 -> {
	            	    		
	            	    		Readyl4.setDisable(false);
	            	    		
	            	    	}));   
	            	    	
	            	    	tl.setCycleCount(1);
	            	    	tl.play();
	            		}
	            		
	            	}
	            	//End of For loop
	            	
	            }
	        });
	        //End of startButton ActionEvent
	        
	        
	        
	        //ButtonClicks
	        Redl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    	        		
    	        		FadeTransition ft = new FadeTransition(Duration.millis(250), TopLl4);
    	    	        ft.setFromValue(1);
    	    	        ft.setToValue(0);
    	    	        ft.play(); 
    	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopLl4);
    	    	        ft1.setFromValue(0);
    	    	        ft1.setToValue(1);
    	    	        ft1.play(); 
    	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[ButtonClicks-1]);
    		        
    				if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevell4.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl4.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl4.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl4.setVisible(true);
    		        }
    		        
    			}
    		});
	        Red2l4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopCl4);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopCl4);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevell4.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl4.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl4.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl4.setVisible(true);
    		        }
    			}
    		});
	        Red3l4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopRl4);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopRl4);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevell4.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl4.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl4.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl4.setVisible(true);
    		        }
    			}
    		});
	        Red4l4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidLl4);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidLl4);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevell4.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl4.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl4.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl4.setVisible(true);
    		        }
    			}
    		});
	        Red5l4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidCl4);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	   				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidCl4);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevell4.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl4.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl4.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl4.setVisible(true);
    		        }
    			}
    		});
	        Red6l4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidRl4);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidRl4);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevell4.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl4.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl4.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl4.setVisible(true);
    		        }
    			}
    		});
	        Red7l4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotLl4);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotLl4);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevell4.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl4.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl4.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl4.setVisible(true);
    		        }
    			}
    		});
	        Red8l4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotCl4);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotCl4);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevell4.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl4.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl4.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl4.setVisible(true);
    		        }
    			}
    		});
	        Red9l4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotRl4);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotRl4);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		        	NextLevell4.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl4.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl4.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl4.setVisible(true);
    		        }
    			}
    		});
	        
			
	        //ReadyButton makes Red Buttons disabled while not clicked
	        Readyl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				TopLl4.setDisable(false);
    			    TopCl4.setDisable(false);
    			    TopRl4.setDisable(false);
    			    MidLl4.setDisable(false);
    			    MidCl4.setDisable(false);
    			    MidRl4.setDisable(false);
    			    BotLl4.setDisable(false);
    			    BotCl4.setDisable(false);
    			    BotRl4.setDisable(false);
    				
    				Redl4.setDisable(false);
    				Red2l4.setDisable(false);
    				Red3l4.setDisable(false);
    				Red4l4.setDisable(false);
    				Red5l4.setDisable(false);
    				Red6l4.setDisable(false);
    				Red7l4.setDisable(false);
    				Red8l4.setDisable(false);
    				Red9l4.setDisable(false);
    				Readyl4.setDisable(true);
    				
    				
    			}
    		});
	        
	        
	        //RESTART
	        TopLl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl4.setVisible(true);
    				System.out.println("Restart");
    				
    			}
    		});
	        TopCl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl4.setVisible(true);
    				System.out.println("Restart");
		   		 
    			}
    		});
	        TopRl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl4.setVisible(true);
    				System.out.println("Restart");
 
    			}
    		});
	        MidLl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl4.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidCl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl4.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidRl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl4.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotLl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl4.setVisible(true);
    				System.out.println("Restart");
    			}
    		});
	        BotCl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl4.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotRl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl4.setVisible(true);   
    				System.out.println("Restart");
    				
    			}
    		});
	        
	        
	        
	        //Restart Button
	        Restartl4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				primaryStage.setScene(start);
    				//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
    				Restartl4.setVisible(false);
    				Readyl4.setDisable(true);
    			}
    		});
	        
	        
	        
	        
	        
	        
	        
	        //LEVEL 5
	        
	        
	        
	      //Level 5 Start screen
	        GridPane startl5 = createGrid();
	        BorderPane rootl5 = new BorderPane();
	        rootl5.setPadding(new Insets(10));
	        rootl5.setCenter(startl5);
	        Scene startlevel5 = new Scene(rootl5, 365, 300);
	        
	        //Level 4 Game
	        GridPane gridl5 = createGrid();
	        BorderPane rootl52 = new BorderPane();
	        rootl52.setPadding(new Insets(10));
	        rootl52.setCenter(gridl5);
	        Scene level5 = new Scene(rootl52, 365, 350);
	        
	        Button startButtonl5 = new Button("START\nLevel 5");
			Button Restartl5 = new Button("RESTART");
			Button NextLevell5 = new Button("NEXT\nLEVEL");
			Button exitl5 = new Button("EXIT");
	    	
	    	startButtonl5.setMinHeight(50);
	    	startButtonl5.setMinWidth(100);
	    	
	    	exitl5.setMinHeight(50);
	    	exitl5.setMinWidth(100);
	    	
	    	Restartl5.setMinHeight(50);
	    	Restartl5.setMinWidth(100);
	    	
	    	exitl5.setMinHeight(50);
	    	exitl5.setMinWidth(100);
	    	
	    	NextLevell5.setMinHeight(50);
	    	NextLevell5.setMinWidth(100);
	    	
	    	startl5.add(startButtonl5, 0, 0);
	    	startl5.add(exitl5, 0, 1);
	    	
	        //show level 5 start screen
	        NextLevell4.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					primaryStage.setScene(startlevel5);
    					NextLevell5.setVisible(false);
    			}
    		});
	        
	        
	        exitl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					System.exit(0);
    			}
    		});
	        
	    	
	    	//
	    	//Game
	    	//
	    	
	    	Button Readyl5 = new Button("Ready");
	    	Readyl5.setMinSize(100, 50);
	    	gridl5.add(Readyl5,1,3);
	    	Readyl5.setDisable(true);

	        Button TopLl5 = new Button("");
	        Button TopCl5 = new Button("");
	        Button TopRl5 = new Button("");
	        Button MidLl5 = new Button("");
	        Button MidCl5 = new Button("");
	        Button MidRl5 = new Button("");
	        Button BotLl5 = new Button("");
	        Button BotCl5 = new Button("");
	        Button BotRl5 = new Button("");
	        
	        Button Redl5 = new Button("");
	        Button Red2l5 = new Button("");
	        Button Red3l5 = new Button("");
	        Button Red4l5 = new Button("");
	        Button Red5l5 = new Button("");
	        Button Red6l5 = new Button("");
	        Button Red7l5 = new Button("");
	        Button Red8l5 = new Button("");
	        Button Red9l5 = new Button("");
	        
	        Redl5.setStyle ("-fx-background-color: #FF0000");
	        Red2l5.setStyle("-fx-background-color: #FF0000");
	        Red3l5.setStyle("-fx-background-color: #FF0000");
	        Red4l5.setStyle("-fx-background-color: #FF0000");
	        Red5l5.setStyle("-fx-background-color: #FF0000");
	        Red6l5.setStyle("-fx-background-color: #FF0000");
	        Red7l5.setStyle("-fx-background-color: #FF0000");
	        Red8l5.setStyle("-fx-background-color: #FF0000");
	        Red9l5.setStyle("-fx-background-color: #FF0000");
	        
	        Redl5.setMinSize(105, 85);
	        Red2l5.setMinSize(105, 85);
	        Red3l5.setMinSize(105, 85);
	        Red4l5.setMinSize(105, 85);
	        Red5l5.setMinSize(105, 85);
	        Red6l5.setMinSize(105, 85);
	        Red7l5.setMinSize(105, 85);
	        Red8l5.setMinSize(105, 85);
	        Red9l5.setMinSize(105, 85);
	        
	        TopLl5.setMinSize(105, 85);
	        TopCl5.setMinSize(105, 85);
	        TopRl5.setMinSize(105, 85);
	        MidLl5.setMinSize(105, 85);
	        MidCl5.setMinSize(105, 85);
	        MidRl5.setMinSize(105, 85);
	        BotLl5.setMinSize(105, 85);
	        BotCl5.setMinSize(105, 85);
	        BotRl5.setMinSize(105, 85);
	        
	        gridl5.add(TopLl5, 0, 0);
	        gridl5.add(TopCl5, 1, 0);
	        gridl5.add(TopRl5, 2, 0);
	        gridl5.add(MidLl5, 0, 1);
	        gridl5.add(MidCl5, 1, 1);
	        gridl5.add(MidRl5, 2, 1);
	        gridl5.add(BotLl5, 0, 2);
	        gridl5.add(BotCl5, 1, 2);
	        gridl5.add(BotRl5, 2, 2);
	        
	        gridl5.add(Redl5,  0, 0);
	        gridl5.add(Red2l5, 1, 0);
	        gridl5.add(Red3l5, 2, 0);
	        gridl5.add(Red4l5, 0, 1);
	        gridl5.add(Red5l5, 1, 1);
	        gridl5.add(Red6l5, 2, 1);
	        gridl5.add(Red7l5, 0, 2);
	        gridl5.add(Red8l5, 1, 2);
	        gridl5.add(Red9l5, 2, 2);
	         
	        Redl5. setVisible(false);
	        Red2l5.setVisible(false);
	        Red3l5.setVisible(false);
	        Red4l5.setVisible(false);
	        Red5l5.setVisible(false);
	        Red6l5.setVisible(false);
	        Red7l5.setVisible(false);
	        Red8l5.setVisible(false);
	        Red9l5.setVisible(false);
	        
	        TopLl5.setStyle("-fx-background-color: #00FF00");
	        TopCl5.setStyle("-fx-background-color: #00FF00");
	        TopRl5.setStyle("-fx-background-color: #00FF00");
	        MidLl5.setStyle("-fx-background-color: #00FF00");
	        MidCl5.setStyle("-fx-background-color: #00FF00");
	        MidRl5.setStyle("-fx-background-color: #00FF00");
	        BotLl5.setStyle("-fx-background-color: #00FF00");
	        BotCl5.setStyle("-fx-background-color: #00FF00");
	        BotRl5.setStyle("-fx-background-color: #00FF00");
	        
	        
	        Restartl5.setMinSize(105, 85);   
	        Restartl5.setStyle("-fx-background-color: #00FFFF");        
	        gridl5.add(Restartl5, 1, 1);
	    	Restartl5.setVisible(false);
	    	
	    	NextLevell5.setMinSize(105, 85);
	        NextLevell5.setStyle("-fx-background-color:  #191970; -fx-text-fill:  #FAEBD7");
	        gridl5.add(NextLevell5, 1, 1);
	    	NextLevell5.setVisible(false);
	        
	        //Random Width
	        for(int i = 0; i < storeW.length; i++) {	
	          storeW[i] = (int)(Math.random()*3);
	        }

	        //Random Height
	        for(int i = 0; i < storeH.length; i++) {
	          storeH[i] = (int)(Math.random()*3); 
	        }
	        
	        
	        startButtonl5.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	            	
	            	//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
	            	
	    	        TopLl5.setDisable(true);
	    		    TopCl5.setDisable(true);
	    		    TopRl5.setDisable(true);
	    		    MidLl5.setDisable(true);
	    		    MidCl5.setDisable(true);
	    		    MidRl5.setDisable(true);
	    		    BotLl5.setDisable(true);
	    		    BotCl5.setDisable(true);
	    		    BotRl5.setDisable(true);
	    	        
	    	        Redl5.setDisable(true);
	    			Red2l5.setDisable(true);
	    			Red3l5.setDisable(true);
	    			Red4l5.setDisable(true);
	    			Red5l5.setDisable(true);
	    			Red6l5.setDisable(true);
	    			Red7l5.setDisable(true);
	    			Red8l5.setDisable(true);
	    			Red9l5.setDisable(true);
	            	
	            	primaryStage.setScene(level5);
	            	
	            	ButtonClicks = 0;
	            	for(int i = 0; i < 4;i++){
	    	        	
	            		if((storeW[i]== 0) && (storeH[i]== 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
	    	    	            	
	            					Redl5.setVisible(true);
	    	    	        		
	    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Redl5);
	    	    	    	        ft.setFromValue(1);
	    	    	    	        ft.setToValue(0);
	    	    	    	        ft.play();
	    	    	    	 
	            			}));   
	            			
	            			tl.setCycleCount(1);
	                		tl.play();
	                		Redl5.setVisible(false);
	                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red2l5.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red2l5);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red2l5.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 0)){
	            			
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red3l5.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red3l5);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red3l5.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red4l5.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red4l5);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red4l5.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 1)){
	    	    	       
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red5l5.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red5l5);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red5l5.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red6l5.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red6l5);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red6l5.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red7l5.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red7l5);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red7l5.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red8l5.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red8l5);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red8l5.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
	            				
            					Red9l5.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red9l5);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red9l5.setVisible(false);
	    	    	        
	            		}
	            		
	            		if(i==2){
	            	    	
	            	    	Timeline tl = new Timeline(new KeyFrame(Duration.millis(4000), e1 -> {
	            	    		
	            	    		Readyl5.setDisable(false);
	            	    		
	            	    	}));   
	            	    	
	            	    	tl.setCycleCount(1);
	            	    	tl.play();
	            		}
	            		
	            	}
	            	//End of For loop
	            	
	            }
	        });
	        //End of startButton ActionEvent
	        
	        
	        
	        //ButtonClicks
	        Redl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    	        		
    	        		FadeTransition ft = new FadeTransition(Duration.millis(250), TopLl5);
    	    	        ft.setFromValue(1);
    	    	        ft.setToValue(0);
    	    	        ft.play(); 
    	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopLl5);
    	    	        ft1.setFromValue(0);
    	    	        ft1.setToValue(1);
    	    	        ft1.play(); 
    	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[ButtonClicks-1]);
    		        
    				if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	NextLevell5.setVisible(true);
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl5.setVisible(true);
    		        }
    		        
    			}
    		});
	        Red2l5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopCl5);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopCl5);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	NextLevell5.setVisible(true);
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 4) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl5.setVisible(true);
    		        }
    			}
    		});
	        Red3l5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopRl5);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopRl5);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        } if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	NextLevell5.setVisible(true);
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl5.setVisible(true);
    		        }
    			}
    		});
	        Red4l5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidLl5);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidLl5);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	NextLevell5.setVisible(true);
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl5.setVisible(true);
    		        }
    			}
    		});
	        Red5l5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidCl5);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	   				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidCl5);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	NextLevell5.setVisible(true);
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl5.setVisible(true);
    		        }
    			}
    		});
	        Red6l5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidRl5);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidRl5);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	NextLevell5.setVisible(true);
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl5.setVisible(true);
    		        }
    			}
    		});
	        Red7l5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotLl5);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotLl5);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	NextLevell5.setVisible(true);
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl5.setVisible(true);
    		        }
    			}
    		});
	        Red8l5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotCl5);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotCl5);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	NextLevell5.setVisible(true);
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl5.setVisible(true);
    		        }
    			}
    		});
	        Red9l5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotRl5);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotRl5);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		        	NextLevell5.setVisible(true);
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl5.setVisible(true);
    		        }
    			}
    		});
	        
			
	        //ReadyButton makes Red Buttons disabled while not clicked
	        Readyl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				TopLl5.setDisable(false);
    			    TopCl5.setDisable(false);
    			    TopRl5.setDisable(false);
    			    MidLl5.setDisable(false);
    			    MidCl5.setDisable(false);
    			    MidRl5.setDisable(false);
    			    BotLl5.setDisable(false);
    			    BotCl5.setDisable(false);
    			    BotRl5.setDisable(false);
    				
    				Redl5.setDisable(false);
    				Red2l5.setDisable(false);
    				Red3l5.setDisable(false);
    				Red4l5.setDisable(false);
    				Red5l5.setDisable(false);
    				Red6l5.setDisable(false);
    				Red7l5.setDisable(false);
    				Red8l5.setDisable(false);
    				Red9l5.setDisable(false);
    				Readyl5.setDisable(true);
    				
    				
    			}
    		});
	        
	        //RESTART
	        TopLl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl5.setVisible(true);
    				System.out.println("Restart");
    				
    			}
    		});
	        TopCl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl5.setVisible(true);
    				System.out.println("Restart");
		   		 
    			}
    		});
	        TopRl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl5.setVisible(true);
    				System.out.println("Restart");
 
    			}
    		});
	        MidLl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl5.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidCl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl5.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidRl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl5.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotLl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl5.setVisible(true);
    				System.out.println("Restart");
    			}
    		});
	        BotCl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl5.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotRl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl5.setVisible(true);   
    				System.out.println("Restart");
    				
    			}
    		});
	        
	        
	        
	        //Restart Button
	        Restartl5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				primaryStage.setScene(start);
    				//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
    				Restartl5.setVisible(false);
    				Readyl5.setDisable(true);
    			}
    		});
	        
	       
	        
	        
	        
	        //LEVEL 6
	        
	        
	        
	      //Level 6 Start screen
	        GridPane startl6 = createGrid();
	        BorderPane rootl6 = new BorderPane();
	        rootl6.setPadding(new Insets(10));
	        rootl6.setCenter(startl6);
	        Scene startlevel6 = new Scene(rootl6, 365, 300);
	        
	        //Level 6 Game
	        GridPane gridl6 = createGrid();
	        BorderPane rootl62 = new BorderPane();
	        rootl62.setPadding(new Insets(10));
	        rootl62.setCenter(gridl6);
	        Scene level6 = new Scene(rootl62, 365, 350);
	        
	        Button startButtonl6 = new Button("START\nLevel 6");
			Button Restartl6 = new Button("RESTART");
			Button NextLevell6 = new Button("NEXT\nLEVEL");
			Button exitl6 = new Button("EXIT");
	    	
	    	startButtonl6.setMinHeight(50);
	    	startButtonl6.setMinWidth(100);
	    	
	    	exitl6.setMinHeight(50);
	    	exitl6.setMinWidth(100);
	    	
	    	Restartl6.setMinHeight(50);
	    	Restartl6.setMinWidth(100);
	    	
	    	exitl6.setMinHeight(50);
	    	exitl6.setMinWidth(100);
	    	
	    	NextLevell6.setMinHeight(50);
	    	NextLevell6.setMinWidth(100);
	    	
	    	startl6.add(startButtonl6, 0, 0);
	    	startl6.add(exitl6, 0, 1);
	    	
	        //show level 6 start screen
	        NextLevell5.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					primaryStage.setScene(startlevel6);
    					NextLevell6.setVisible(false);
    			}
    		});
	        
	        
	        exitl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					System.exit(0);
    			}
    		});
	        
	    	
	    	//
	    	//Game
	    	//
	    	
	    	Button Readyl6 = new Button("Ready");
	    	Readyl6.setMinSize(100, 50);
	    	gridl6.add(Readyl6,1,3);
	    	Readyl6.setDisable(true);
	    	
	    	
	    	

	        Button TopLl6 = new Button("");
	        Button TopCl6 = new Button("");
	        Button TopRl6 = new Button("");
	        Button MidLl6 = new Button("");
	        Button MidCl6 = new Button("");
	        Button MidRl6 = new Button("");
	        Button BotLl6 = new Button("");
	        Button BotCl6 = new Button("");
	        Button BotRl6 = new Button("");
	        
	        Button Redl6 = new Button("");
	        Button Red2l6 = new Button("");
	        Button Red3l6 = new Button("");
	        Button Red4l6 = new Button("");
	        Button Red5l6 = new Button("");
	        Button Red6l6 = new Button("");
	        Button Red7l6 = new Button("");
	        Button Red8l6 = new Button("");
	        Button Red9l6 = new Button("");
	        
	        Redl6.setStyle ("-fx-background-color: #FF0000");
	        Red2l6.setStyle("-fx-background-color: #FF0000");
	        Red3l6.setStyle("-fx-background-color: #FF0000");
	        Red4l6.setStyle("-fx-background-color: #FF0000");
	        Red5l6.setStyle("-fx-background-color: #FF0000");
	        Red6l6.setStyle("-fx-background-color: #FF0000");
	        Red7l6.setStyle("-fx-background-color: #FF0000");
	        Red8l6.setStyle("-fx-background-color: #FF0000");
	        Red9l6.setStyle("-fx-background-color: #FF0000");
	       
	        Redl6.setMinSize(105, 85);
	        Red2l6.setMinSize(105, 85);
	        Red3l6.setMinSize(105, 85);
	        Red4l6.setMinSize(105, 85);
	        Red5l6.setMinSize(105, 85);
	        Red6l6.setMinSize(105, 85);
	        Red7l6.setMinSize(105, 85);
	        Red8l6.setMinSize(105, 85);
	        Red9l6.setMinSize(105, 85);
	        
	        TopLl6.setMinSize(105, 85);
	        TopCl6.setMinSize(105, 85);
	        TopRl6.setMinSize(105, 85);
	        MidLl6.setMinSize(105, 85);
	        MidCl6.setMinSize(105, 85);
	        MidRl6.setMinSize(105, 85);
	        BotLl6.setMinSize(105, 85);
	        BotCl6.setMinSize(105, 85);
	        BotRl6.setMinSize(105, 85);
	        
	        gridl6.add(TopLl6, 0, 0);
	        gridl6.add(TopCl6, 1, 0);
	        gridl6.add(TopRl6, 2, 0);
	        gridl6.add(MidLl6, 0, 1);
	        gridl6.add(MidCl6, 1, 1);
	        gridl6.add(MidRl6, 2, 1);
	        gridl6.add(BotLl6, 0, 2);
	        gridl6.add(BotCl6, 1, 2);
	        gridl6.add(BotRl6, 2, 2);
	        
	        gridl6.add(Redl6,  0, 0);
	        gridl6.add(Red2l6, 1, 0);
	        gridl6.add(Red3l6, 2, 0);
	        gridl6.add(Red4l6, 0, 1);
	        gridl6.add(Red5l6, 1, 1);
	        gridl6.add(Red6l6, 2, 1);
	        gridl6.add(Red7l6, 0, 2);
	        gridl6.add(Red8l6, 1, 2);
	        gridl6.add(Red9l6, 2, 2);
	         
	        Redl6. setVisible(false);
	        Red2l6.setVisible(false);
	        Red3l6.setVisible(false);
	        Red4l6.setVisible(false);
	        Red5l6.setVisible(false);
	        Red6l6.setVisible(false);
	        Red7l6.setVisible(false);
	        Red8l6.setVisible(false);
	        Red9l6.setVisible(false);
	        
	        TopLl6.setStyle("-fx-background-color: #00FF00");
	        TopCl6.setStyle("-fx-background-color: #00FF00");
	        TopRl6.setStyle("-fx-background-color: #00FF00");
	        MidLl6.setStyle("-fx-background-color: #00FF00");
	        MidCl6.setStyle("-fx-background-color: #00FF00");
	        MidRl6.setStyle("-fx-background-color: #00FF00");
	        BotLl6.setStyle("-fx-background-color: #00FF00");
	        BotCl6.setStyle("-fx-background-color: #00FF00");
	        BotRl6.setStyle("-fx-background-color: #00FF00");
	        
	        
	        Restartl6.setMinSize(105, 85);   
	        Restartl6.setStyle("-fx-background-color: #00FFFF");        
	        gridl6.add(Restartl6, 1, 1);
	    	Restartl6.setVisible(false);
	    	
	    	NextLevell6.setMinSize(105, 85);
	        NextLevell6.setStyle("-fx-background-color:  #191970; -fx-text-fill:  #FAEBD7");
	        gridl6.add(NextLevell6, 1, 1);
	    	NextLevell6.setVisible(false);
	        
	        //Random Width
	        for(int i = 0; i < storeW.length; i++) {	
	          storeW[i] = (int)(Math.random()*3);
	        }

	        //Random Height
	        for(int i = 0; i < storeH.length; i++) {
	          storeH[i] = (int)(Math.random()*3); 
	        }
	        
	        
	        startButtonl6.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	            	
	            	//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
	            	
	    	        TopLl6.setDisable(true);
	    		    TopCl6.setDisable(true);
	    		    TopRl6.setDisable(true);
	    		    MidLl6.setDisable(true);
	    		    MidCl6.setDisable(true);
	    		    MidRl6.setDisable(true);
	    		    BotLl6.setDisable(true);
	    		    BotCl6.setDisable(true);
	    		    BotRl6.setDisable(true);
	    	        
	    	        Redl6.setDisable(true);
	    			Red2l6.setDisable(true);
	    			Red3l6.setDisable(true);
	    			Red4l6.setDisable(true);
	    			Red5l6.setDisable(true);
	    			Red6l6.setDisable(true);
	    			Red7l6.setDisable(true);
	    			Red8l6.setDisable(true);
	    			Red9l6.setDisable(true);
	            	
	            	primaryStage.setScene(level6);
	            	
	            	ButtonClicks = 0;
	            	for(int i = 0; i < 5;i++){
	    	        	
	            		if((storeW[i]== 0) && (storeH[i]== 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
	    	    	            	
	            					Redl6.setVisible(true);
	    	    	        		
	    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Redl6);
	    	    	    	        ft.setFromValue(1);
	    	    	    	        ft.setToValue(0);
	    	    	    	        ft.play();
	    	    	    	 
	            			}));   
	            			
	            			tl.setCycleCount(1);
	                		tl.play();
	                		Redl6.setVisible(false);
	                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red2l6.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red2l6);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red2l6.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 0)){
	            			
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red3l6.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red3l6);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red3l6.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red4l6.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red4l6);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red4l6.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 1)){
	    	    	       
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red5l6.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red5l6);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red5l6.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red6l6.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red6l6);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red6l6.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red7l6.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red7l6);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red7l6.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
    	    	            	
            					Red8l6.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red8l6);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red8l6.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*800), e1 -> {
	            				
            					Red9l6.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(800), Red9l6);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red9l6.setVisible(false);
	    	    	        
	            		}
	            		
	            		if(i==2){
	            	    	
	            	    	Timeline tl = new Timeline(new KeyFrame(Duration.millis(4800), e1 -> {
	            	    		
	            	    		Readyl6.setDisable(false);
	            	    		
	            	    	}));   
	            	    	
	            	    	tl.setCycleCount(1);
	            	    	tl.play();
	            		}
	            		
	            	}
	            	//End of For loop
	            	
	            }
	        });
	        //End of startButton ActionEvent
	        
	        
	        
	        //ButtonClicks
	        Redl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    	        		
    	        		FadeTransition ft = new FadeTransition(Duration.millis(250), TopLl6);
    	    	        ft.setFromValue(1);
    	    	        ft.setToValue(0);
    	    	        ft.play(); 
    	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopLl6);
    	    	        ft1.setFromValue(0);
    	    	        ft1.setToValue(1);
    	    	        ft1.play(); 
    	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[ButtonClicks-1]);
    		        
    				if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell6.setVisible(true);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl6.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }
    		       
    		        
    			}
    		});
	        Red2l6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopCl6);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopCl6);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell6.setVisible(true);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl6.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl5.setVisible(true);
    		        } if((ButtonClicks == 4) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }
    			}
    		});
	        Red3l6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopRl6);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopRl6);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        } if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell6.setVisible(true);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl6.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }
    			}
    		});
	        Red4l6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidLl6);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidLl6);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell6.setVisible(true);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl6.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }
    			}
    		});
	        Red5l6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidCl6);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	   				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidCl6);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell6.setVisible(true);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl6.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }
    			}
    		});
	        Red6l6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidRl6);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidRl6);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		     
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell6.setVisible(true);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl6.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }
    			}
    		});
	        Red7l6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotLl6);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotLl6);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell6.setVisible(true);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl6.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }
    			}
    		});
	        Red8l6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotCl6);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotCl6);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell6.setVisible(true);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }
    			}
    		});
	        Red9l6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotRl6);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotRl6);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	NextLevell6.setVisible(true);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl6.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl6.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl6.setVisible(true);
    		        }
    			}
    		});
	        
			
	        //ReadyButton makes Red Buttons disabled while not clicked
	        Readyl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				TopLl6.setDisable(false);
    			    TopCl6.setDisable(false);
    			    TopRl6.setDisable(false);
    			    MidLl6.setDisable(false);
    			    MidCl6.setDisable(false);
    			    MidRl6.setDisable(false);
    			    BotLl6.setDisable(false);
    			    BotCl6.setDisable(false);
    			    BotRl6.setDisable(false);
    				
    				Redl6.setDisable(false);
    				Red2l6.setDisable(false);
    				Red3l6.setDisable(false);
    				Red4l6.setDisable(false);
    				Red5l6.setDisable(false);
    				Red6l6.setDisable(false);
    				Red7l6.setDisable(false);
    				Red8l6.setDisable(false);
    				Red9l6.setDisable(false);
    				Readyl6.setDisable(true);
    				
    				
    			}
    		});
	        
	        //RESTART
	        TopLl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl6.setVisible(true);
    				System.out.println("Restart");
    				
    			}
    		});
	        TopCl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl6.setVisible(true);
    				System.out.println("Restart");
		   		 
    			}
    		});
	        TopRl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl6.setVisible(true);
    				System.out.println("Restart");
 
    			}
    		});
	        MidLl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl6.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidCl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl6.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidRl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl6.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotLl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl6.setVisible(true);
    				System.out.println("Restart");
    			}
    		});
	        BotCl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl6.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotRl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl6.setVisible(true);   
    				System.out.println("Restart");
    				
    			}
    		});
	        
	        
	        
	        //Restart Button
	        Restartl6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				primaryStage.setScene(start);
    				//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
    				Restartl6.setVisible(false);
    				Readyl6.setDisable(true);
    			}
    		});
	        
	        
	        
	        
	        
	        
	        //LEVEL 7
	        
	        
	        
	      //Level 7 Start screen
	        GridPane startl7 = createGrid();
	        BorderPane rootl7 = new BorderPane();
	        rootl7.setPadding(new Insets(10));
	        rootl7.setCenter(startl7);
	        Scene startlevel7 = new Scene(rootl7, 365, 300);
	        
	        //Level 7 Game
	        GridPane gridl7 = createGrid();
	        BorderPane rootl72 = new BorderPane();
	        rootl72.setPadding(new Insets(10));
	        rootl72.setCenter(gridl7);
	        Scene level7 = new Scene(rootl72, 365, 350);
	        
	        Button startButtonl7 = new Button("Good Luck :)");
			Button Restartl7 = new Button("RESTART");
			Button NextLevell7 = new Button("NEXT\nLEVEL");
			Button exitl7 = new Button("EXIT");
	    	
	    	startButtonl7.setMinHeight(50);
	    	startButtonl7.setMinWidth(100);
	    	
	    	exitl7.setMinHeight(50);
	    	exitl7.setMinWidth(100);
	    	
	    	Restartl7.setMinHeight(50);
	    	Restartl7.setMinWidth(100);
	    	
	    	exitl7.setMinHeight(50);
	    	exitl7.setMinWidth(100);
	    	
	    	NextLevell7.setMinHeight(50);
	    	NextLevell7.setMinWidth(100);
	    	
	    	startl7.add(startButtonl7, 0, 0);
	    	startl7.add(exitl7, 0, 1);
	    	
	        //show level 4 start screen
	        NextLevell6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					primaryStage.setScene(startlevel7);
    					NextLevell7.setVisible(false);
    			}
    		});
	        
	        
	        exitl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    					System.exit(0);
    			}
    		});
	        
	    	
	    	//
	    	//Game
	    	//
	        
	        Button Win = new Button("YOU WIN!");
	    	Win.setMinSize(105, 85);
	        Win.setStyle("-fx-background-color:  #FFD700");
	        gridl7.add(Win, 1, 1);
	    	Win.setVisible(false);
	        
	        
	    	Button Readyl7 = new Button("Ready");
	    	Readyl7.setMinSize(100, 50);
	    	gridl7.add(Readyl7,1,3);
	    	Readyl7.setDisable(true);

	        Button TopLl7 = new Button("");
	        Button TopCl7 = new Button("");
	        Button TopRl7 = new Button("");
	        Button MidLl7 = new Button("");
	        Button MidCl7 = new Button("");
	        Button MidRl7 = new Button("");
	        Button BotLl7 = new Button("");
	        Button BotCl7 = new Button("");
	        Button BotRl7 = new Button("");
	        
	        Button Redl7 = new Button("");
	        Button Red2l7 = new Button("");
	        Button Red3l7 = new Button("");
	        Button Red4l7 = new Button("");
	        Button Red5l7 = new Button("");
	        Button Red6l7 = new Button("");
	        Button Red7l7 = new Button("");
	        Button Red8l7 = new Button("");
	        Button Red9l7 = new Button("");
	        
	        Redl7.setStyle ("-fx-background-color: #FF0000");
	        Red2l7.setStyle("-fx-background-color: #FF0000");
	        Red3l7.setStyle("-fx-background-color: #FF0000");
	        Red4l7.setStyle("-fx-background-color: #FF0000");
	        Red5l7.setStyle("-fx-background-color: #FF0000");
	        Red6l7.setStyle("-fx-background-color: #FF0000");
	        Red7l7.setStyle("-fx-background-color: #FF0000");
	        Red8l7.setStyle("-fx-background-color: #FF0000");
	        Red9l7.setStyle("-fx-background-color: #FF0000");
	       
	        Redl7.setMinSize(105, 85);
	        Red2l7.setMinSize(105, 85);
	        Red3l7.setMinSize(105, 85);
	        Red4l7.setMinSize(105, 85);
	        Red5l7.setMinSize(105, 85);
	        Red6l7.setMinSize(105, 85);
	        Red7l7.setMinSize(105, 85);
	        Red8l7.setMinSize(105, 85);
	        Red9l7.setMinSize(105, 85);
	        
	        TopLl7.setMinSize(105, 85);
	        TopCl7.setMinSize(105, 85);
	        TopRl7.setMinSize(105, 85);
	        MidLl7.setMinSize(105, 85);
	        MidCl7.setMinSize(105, 85);
	        MidRl7.setMinSize(105, 85);
	        BotLl7.setMinSize(105, 85);
	        BotCl7.setMinSize(105, 85);
	        BotRl7.setMinSize(105, 85);
	        
	        gridl7.add(TopLl7, 0, 0);
	        gridl7.add(TopCl7, 1, 0);
	        gridl7.add(TopRl7, 2, 0);
	        gridl7.add(MidLl7, 0, 1);
	        gridl7.add(MidCl7, 1, 1);
	        gridl7.add(MidRl7, 2, 1);
	        gridl7.add(BotLl7, 0, 2);
	        gridl7.add(BotCl7, 1, 2);
	        gridl7.add(BotRl7, 2, 2);
	        
	        gridl7.add(Redl7,  0, 0);
	        gridl7.add(Red2l7, 1, 0);
	        gridl7.add(Red3l7, 2, 0);
	        gridl7.add(Red4l7, 0, 1);
	        gridl7.add(Red5l7, 1, 1);
	        gridl7.add(Red6l7, 2, 1);
	        gridl7.add(Red7l7, 0, 2);
	        gridl7.add(Red8l7, 1, 2);
	        gridl7.add(Red9l7, 2, 2);
	         
	        Redl7. setVisible(false);
	        Red2l7.setVisible(false);
	        Red3l7.setVisible(false);
	        Red4l7.setVisible(false);
	        Red5l7.setVisible(false);
	        Red6l7.setVisible(false);
	        Red7l7.setVisible(false);
	        Red8l7.setVisible(false);
	        Red9l7.setVisible(false);
	        
	        TopLl7.setStyle("-fx-background-color: #00FF00");
	        TopCl7.setStyle("-fx-background-color: #00FF00");
	        TopRl7.setStyle("-fx-background-color: #00FF00");
	        MidLl7.setStyle("-fx-background-color: #00FF00");
	        MidCl7.setStyle("-fx-background-color: #00FF00");
	        MidRl7.setStyle("-fx-background-color: #00FF00");
	        BotLl7.setStyle("-fx-background-color: #00FF00");
	        BotCl7.setStyle("-fx-background-color: #00FF00");
	        BotRl7.setStyle("-fx-background-color: #00FF00");
	        
	        
	        Restartl7.setMinSize(105, 85);   
	        Restartl7.setStyle("-fx-background-color: #00FFFF");        
	        gridl7.add(Restartl7, 1, 1);
	    	Restartl7.setVisible(false);
	    	
	    	NextLevell7.setMinSize(105, 85);
	        NextLevell7.setStyle("-fx-background-color:  #191970; -fx-text-fill:  #FAEBD7");
	        gridl7.add(NextLevell7, 1, 1);
	    	NextLevell7.setVisible(false);
	        
	        //Random Width
	        for(int i = 0; i < storeW.length; i++) {	
	          storeW[i] = (int)(Math.random()*3);
	        }

	        //Random Height
	        for(int i = 0; i < storeH.length; i++) {
	          storeH[i] = (int)(Math.random()*3); 
	        }
	        
	        
	        startButtonl7.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	            	
	            	//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
	            	
	    	        TopLl7.setDisable(true);
	    		    TopCl7.setDisable(true);
	    		    TopRl7.setDisable(true);
	    		    MidLl7.setDisable(true);
	    		    MidCl7.setDisable(true);
	    		    MidRl7.setDisable(true);
	    		    BotLl7.setDisable(true);
	    		    BotCl7.setDisable(true);
	    		    BotRl7.setDisable(true);
	    	        
	    	        Redl7.setDisable(true);
	    			Red2l7.setDisable(true);
	    			Red3l7.setDisable(true);
	    			Red4l7.setDisable(true);
	    			Red5l7.setDisable(true);
	    			Red6l7.setDisable(true);
	    			Red7l7.setDisable(true);
	    			Red8l7.setDisable(true);
	    			Red9l7.setDisable(true);
	            	
	            	primaryStage.setScene(level7);
	            	
	            	ButtonClicks = 0;
	            	for(int i = 0; i < 5;i++){
	    	        	
	            		if((storeW[i]== 0) && (storeH[i]== 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*300), e1 -> {
	    	    	            	
	            					Redl7.setVisible(true);
	    	    	        		
	    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(300), Redl7);
	    	    	    	        ft.setFromValue(1);
	    	    	    	        ft.setToValue(0);
	    	    	    	        ft.play();
	    	    	    	 
	            			}));   
	            			
	            			tl.setCycleCount(1);
	                		tl.play();
	                		Redl7.setVisible(false);
	                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 0)){

	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*300), e1 -> {
    	    	            	
            					Red2l7.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(300), Red2l7);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red2l7.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 0)){
	            			
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*300), e1 -> {
    	    	            	
            					Red3l7.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(300), Red3l7);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red3l7.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*300), e1 -> {
    	    	            	
            					Red4l7.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(300), Red4l7);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red4l7.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 1)){
	    	    	       
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*300), e1 -> {
    	    	            	
            					Red5l7.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(300), Red5l7);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red5l7.setVisible(false);
                		
	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 1)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*300), e1 -> {
    	    	            	
            					Red6l7.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(300), Red6l7);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red6l7.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 0) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*300), e1 -> {
    	    	            	
            					Red7l7.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(300), Red7l7);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red7l7.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 1) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*300), e1 -> {
    	    	            	
            					Red8l7.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(300), Red8l7);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red8l7.setVisible(false);

	    	        	}
	            		else if((storeW[i] == 2) && (storeH[i] == 2)){
	    		        	
	            			Timeline tl = new Timeline(new KeyFrame(Duration.millis((i+1)*300), e1 -> {
	            				
            					Red9l7.setVisible(true);
    	    	        		
    	    	        		FadeTransition ft = new FadeTransition(Duration.millis(300), Red9l7);
    	    	    	        ft.setFromValue(1);
    	    	    	        ft.setToValue(0);
    	    	    	        ft.play();
    	    	    	 
            			}));   
            			
            			tl.setCycleCount(1);
                		tl.play();
                		Red9l7.setVisible(false);
	    	    	        
	            		}
	            		
	            		if(i==2){
	            	    	
	            	    	Timeline tl = new Timeline(new KeyFrame(Duration.millis(2500), e1 -> {
	            	    		
	            	    		Readyl7.setDisable(false);
	            	    		
	            	    	}));   
	            	    	
	            	    	tl.setCycleCount(1);
	            	    	tl.play();
	            		}
	            		
	            	}
	            	//End of For loop
	            	
	            }
	        });
	        //End of startButton ActionEvent
	        
	        
	        
	        //ButtonClicks
	        Redl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    	        		
    	        		FadeTransition ft = new FadeTransition(Duration.millis(250), TopLl7);
    	    	        ft.setFromValue(1);
    	    	        ft.setToValue(0);
    	    	        ft.play(); 
    	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopLl7);
    	    	        ft1.setFromValue(0);
    	    	        ft1.setToValue(1);
    	    	        ft1.play(); 
    	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[ButtonClicks-1]);
    		        
    				if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	Win.setVisible(true);
    		        	TopL.setVisible(false);
    		        	TopC.setVisible(false);
    		        	TopR.setVisible(false);
    		        	MidL.setVisible(false);
    		        	MidC.setVisible(false);
    		        	MidR.setVisible(false);
    		        	BotL.setVisible(false);
    		        	BotC.setVisible(false);
    		        	BotR.setVisible(false);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl7.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }
    		       
    		        
    			}
    		});
	        Red2l7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopCl7);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopCl7);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
	    	        
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	Win.setVisible(true);
    		        	TopL.setVisible(false);
    		        	TopC.setVisible(false);
    		        	TopR.setVisible(false);
    		        	MidL.setVisible(false);
    		        	MidC.setVisible(false);
    		        	MidR.setVisible(false);
    		        	BotL.setVisible(false);
    		        	BotC.setVisible(false);
    		        	BotR.setVisible(false);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl7.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl7.setVisible(true);
    		        } if((ButtonClicks == 4) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }
    			}
    		});
	        Red3l7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), TopRl7);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), TopRl7);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 0;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        } if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	Win.setVisible(true);
    		        	TopL.setVisible(false);
    		        	TopC.setVisible(false);
    		        	TopR.setVisible(false);
    		        	MidL.setVisible(false);
    		        	MidC.setVisible(false);
    		        	MidR.setVisible(false);
    		        	BotL.setVisible(false);
    		        	BotC.setVisible(false);
    		        	BotR.setVisible(false);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl7.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }
    			}
    		});
	        Red4l7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidLl7);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play(); 
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidLl7);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play(); 
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	Win.setVisible(true);
    		        	TopL.setVisible(false);
    		        	TopC.setVisible(false);
    		        	TopR.setVisible(false);
    		        	MidL.setVisible(false);
    		        	MidC.setVisible(false);
    		        	MidR.setVisible(false);
    		        	BotL.setVisible(false);
    		        	BotC.setVisible(false);
    		        	BotR.setVisible(false);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl7.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }
    			}
    		});
	        Red5l7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidCl7);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	   				FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidCl7);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){

    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	Win.setVisible(true);
    		        	TopL.setVisible(false);
    		        	TopC.setVisible(false);
    		        	TopR.setVisible(false);
    		        	MidL.setVisible(false);
    		        	MidC.setVisible(false);
    		        	MidR.setVisible(false);
    		        	BotL.setVisible(false);
    		        	BotC.setVisible(false);
    		        	BotR.setVisible(false);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl7.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }
    			}
    		});
	        Red6l7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), MidRl7);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
	    	        FadeTransition ft1 = new FadeTransition(Duration.millis(250), MidRl7);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 1;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		     
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	Win.setVisible(true);
    		        	TopL.setVisible(false);
    		        	TopC.setVisible(false);
    		        	TopR.setVisible(false);
    		        	MidL.setVisible(false);
    		        	MidC.setVisible(false);
    		        	MidR.setVisible(false);
    		        	BotL.setVisible(false);
    		        	BotC.setVisible(false);
    		        	BotR.setVisible(false);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl7.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }
    			}
    		});
	        Red7l7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotLl7);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotLl7);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 0;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	Win.setVisible(true);
    		        	TopL.setVisible(false);
    		        	TopC.setVisible(false);
    		        	TopR.setVisible(false);
    		        	MidL.setVisible(false);
    		        	MidC.setVisible(false);
    		        	MidR.setVisible(false);
    		        	BotL.setVisible(false);
    		        	BotC.setVisible(false);
    		        	BotR.setVisible(false);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl7.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }
    			}
    		});
	        Red8l7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotCl7);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotCl7);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 1;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	Win.setVisible(true);
    		        	TopL.setVisible(false);
    		        	TopC.setVisible(false);
    		        	TopR.setVisible(false);
    		        	MidL.setVisible(false);
    		        	MidC.setVisible(false);
    		        	MidR.setVisible(false);
    		        	BotL.setVisible(false);
    		        	BotC.setVisible(false);
    		        	BotR.setVisible(false);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }
    			}
    		});
	        Red9l6.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				FadeTransition ft = new FadeTransition(Duration.millis(250), BotRl7);
	    	        ft.setFromValue(1);
	    	        ft.setToValue(0);
	    	        ft.play();
    				FadeTransition ft1 = new FadeTransition(Duration.millis(250), BotRl7);
	    	        ft1.setFromValue(0);
	    	        ft1.setToValue(1);
	    	        ft1.play();
    				
    				ButtonClicks();
    				correctW[ButtonClicks-1] = 2;
    				correctH[ButtonClicks-1] = 2;
    				System.out.println("W: " + correctW[(ButtonClicks-1)]);
    				System.out.println("H: " + correctH[(ButtonClicks-1)]);
    		        if((ButtonClicks == 1) & (storeW[0] == correctW[0]) & (storeH[0] == correctH[0])){
    		        	System.out.println("1: Correct");
    		        }
    		        if((ButtonClicks == 2) & (storeW[1] == correctW[1]) & (storeH[1] == correctH[1])){
    		        	System.out.println("2: Correct");
    		        }
    		        if((ButtonClicks == 3) & (storeW[2] == correctW[2]) & (storeH[2] == correctH[2])){
    		    		System.out.println("3: Correct");
    		        }if((ButtonClicks == 4) & (storeW[3] == correctW[3]) & (storeH[3] == correctH[3])){
    		    		System.out.println("4: Correct");
    		        }if((ButtonClicks == 5) & (storeW[4] == correctW[4]) & (storeH[4] == correctH[4])){
    		        	Win.setVisible(true);
    		        	TopL.setVisible(false);
    		        	TopC.setVisible(false);
    		        	TopR.setVisible(false);
    		        	MidL.setVisible(false);
    		        	MidC.setVisible(false);
    		        	MidR.setVisible(false);
    		        	BotL.setVisible(false);
    		        	BotC.setVisible(false);
    		        	BotR.setVisible(false);
    		    		System.out.println("5: Correct");
    		        }if((ButtonClicks == 1) & ((storeW[0] != correctW[0]) | (storeH[0] != correctH[0]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 2) & ((storeW[1] != correctW[1]) | (storeH[1] != correctH[1]))){
    		        	Restartl7.setVisible(true);
    		        } if((ButtonClicks == 3) & ((storeW[2] != correctW[2]) | (storeH[2] != correctH[2]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 4) & ((storeW[3] != correctW[3]) | (storeH[3] != correctH[3]))){
    		        	Restartl7.setVisible(true);
    		        }if((ButtonClicks == 5) & ((storeW[4] != correctW[4]) | (storeH[4] != correctH[4]))){
    		        	Restartl7.setVisible(true);
    		        }
    			}
    		});
	        
			
	        //ReadyButton makes Red Buttons disabled while not clicked
	        Readyl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				
    				TopLl7.setDisable(false);
    			    TopCl7.setDisable(false);
    			    TopRl7.setDisable(false);
    			    MidLl7.setDisable(false);
    			    MidCl7.setDisable(false);
    			    MidRl7.setDisable(false);
    			    BotLl7.setDisable(false);
    			    BotCl7.setDisable(false);
    			    BotRl7.setDisable(false);
    				
    				Redl7.setDisable(false);
    				Red2l7.setDisable(false);
    				Red3l7.setDisable(false);
    				Red4l7.setDisable(false);
    				Red5l7.setDisable(false);
    				Red6l7.setDisable(false);
    				Red7l7.setDisable(false);
    				Red8l7.setDisable(false);
    				Red9l7.setDisable(false);
    				Readyl7.setDisable(true);
    				
    				
    			}
    		});
	        
	        //RESTART
	        TopLl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl7.setVisible(true);
    				System.out.println("Restart");
    				
    			}
    		});
	        TopCl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl7.setVisible(true);
    				System.out.println("Restart");
		   		 
    			}
    		});
	        TopRl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl7.setVisible(true);
    				System.out.println("Restart");
 
    			}
    		});
	        MidLl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl7.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidCl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl7.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        MidRl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl7.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotLl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl7.setVisible(true);
    				System.out.println("Restart");
    			}
    		});
	        BotCl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl7.setVisible(true);
    				System.out.println("Restart");

    			}
    		});
	        BotRl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				Restartl7.setVisible(true);   
    				System.out.println("Restart");
    				
    			}
    		});
	        
	        
	        
	        //Restart Button
	        Restartl7.setOnAction(new EventHandler<ActionEvent>() {
    			@Override public void handle(ActionEvent e) {
    				primaryStage.setScene(start);
    				//Random Width
    		        for(int i = 0; i < storeW.length; i++) {	
    		          storeW[i] = (int)(Math.random()*3);
    		        }

    		        //Random Height
    		        for(int i = 0; i < storeH.length; i++) {
    		          storeH[i] = (int)(Math.random()*3); 
    		        }
    				Restartl7.setVisible(false);
    				Readyl7.setDisable(true);
    			}
    		});
	    }

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    public void ButtonClicks(){
	    	ButtonClicks++;
	    }
	    
	    private GridPane createGrid() {
	        GridPane grid = new GridPane();
	        grid.setAlignment(Pos.CENTER);
	        grid.setHgap(5);
	        grid.setVgap(5);
	        grid.setPadding(new Insets(10));
	        return grid;
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}
