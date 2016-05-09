package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainScreen extends Stage {
	// All the Boxes

	// Root
	private BorderPane root = new BorderPane();

	//Top Pane
	private VBox topPane = new VBox();
	private HBox headerBox= new HBox();
	private HBox infoBox = new HBox();
	private VBox infoLabelBox = new VBox();
	private VBox infoTextFieldBox = new VBox();


	// Center Pane
	private VBox centerPane = new VBox();
	// Courses Taken Views
	private HBox coursesTakenBox = new HBox();
	private VBox rctBox = new VBox();
	private VBox octBox = new VBox();
	private VBox cwfBox = new VBox();
	private VBox ccBox = new VBox();

	// Courses Needed
	private HBox coursesNeededBox = new HBox();
	private VBox cnBox = new VBox();

	// Summary Box
	private HBox summaryBox = new HBox();
	private HBox summaryLeftBox = new HBox();
	private VBox summaryLeftLabelsBox = new VBox();
	private VBox summaryLeftTextFieldsBox = new VBox();
	private HBox summaryRightBox = new HBox();
	private VBox summaryRightLabelsBox = new VBox();
	private VBox summaryRightTextFieldsBox = new VBox();

	// Bottom Box
	private VBox bottom = new VBox();

	// Buttons
	private Button sainReportButton = new Button("Generate Sain Report");
	private Button searchButton = new Button("Search For Student");
	private Button saveButton = new Button(" Save changes");
	private Button whatIfButton = new Button("What If Analysis");
	// Listeners
	private SainReportButtonListener sainReportButtonListener;
	private WhatIfButtonListener whatIfButtonListener;
	private SearchButtonListener searchButtonListener;
	private SaveButtonListener SaveButtonListener;


	// Labels Based on the Sain report Page
	private Label headerH = new Label();
	private Label program = new Label("Program: ");
	private Label degree = new Label("Degree: ");
	private Label major = new Label("Major: ");
	private Label cumulativeGPA = new Label("Cumulative GPA: ");
	private Label programGPA = new Label("Program GPA: ");
	private Label majorGpa = new Label("Major GPA: ");
	private Label requiredCourses = new Label("Required Courses ");
	private Label otherCourses = new Label("Other Courses ");
	private Label withdrew = new Label("Courses Withdrawn ");
	private Label currentCourses = new Label("Current Courses = ");
	private Label coursesNeeded = new Label("Courses Needed ");
	private Label minGPA = new Label("Minimum GPA: ");
	private Label totalCreds = new Label("Total Credits Required: ");
	private Label minNum = new Label("Minimum Number of Degree Credits: ");
	private Label totalCredsTakenC = new Label("Total Credits at SCCC");
	private Label totalCreditsDegree = new Label("Total Credits Toward Degree: ");
	private Label totalCredsTaken = new Label("Total Credits Taken: ");

	//TextFields
	private TextField programT = new TextField();
	private TextField degreeT = new TextField();
	private TextField majorT = new TextField();
	private TextField cumulativeGPAT = new TextField();
	private TextField pGPAT = new TextField();
	private TextField mGPAT = new TextField();
	private TextField campusT = new TextField();
	private TextField minGPAshow = new TextField();
	private TextField totalCredsshow = new TextField();
	private TextField minNumshow = new TextField();
	private TextField totalCredsTakenCShow = new TextField();
	private TextField totalCreditsDegreeShow = new TextField();
	private TextField totalCredsTakenShow = new TextField();
	//ListViews
	private ListView reqCTV = new ListView();
	private ListView otherCTV = new ListView();
	private ListView withdrawCTV = new ListView();
	private ListView currentCTV = new ListView();
	private ListView neededCV = new ListView();




	public MainScreen() {
		root = new BorderPane(); // Set the Root, the rest is made by controller
		Stage mainStage = new Stage(); // depending on the person Logged in
		mainStage.setTitle("MySCCC Login Screen");
		textFieldsResize();
		centerPane.setPadding(new Insets(10, 10, 10, 10));
		centerPane.setAlignment(Pos.CENTER);
		bottom.setPadding(new Insets(10, 10, 10, 10));
		bottom.setAlignment(Pos.BASELINE_CENTER);

		// Button Action Handling
		// SAIN Button
		sainReportButton.setOnAction(e -> {
			SainReportButtonEvent ev = new SainReportButtonEvent(this);
			if (sainReportButtonListener != null) {
				sainReportButtonListener.sainReportButtonClicked(ev);
			}
		});
		// What If Button
		whatIfButton.setOnAction(e -> {
			WhatIfButtonEventObject ev = new WhatIfButtonEventObject(this);
			if (whatIfButtonListener != null) {
				whatIfButtonListener.whatIfButtonClicked(ev);
			}
		});

		searchButton.setOnAction(e -> {
			WhatIfButtonEventObject ev = new WhatIfButtonEventObject(this);
			if (whatIfButtonListener != null) {
				whatIfButtonListener.whatIfButtonClicked(ev);
			}
		});
		saveButton.setOnAction(e -> {
			WhatIfButtonEventObject ev = new WhatIfButtonEventObject(this);
			if (whatIfButtonListener != null) {
				whatIfButtonListener.whatIfButtonClicked(ev);
			}
		});

		mainStage.setScene(new Scene(root, 1000, 600));
		mainStage.show();
	}



	// Sets the size of the TextFields all to 300
	public void textFieldsResize() {
		int width = 300;
		programT.setMaxWidth(width);
		degreeT.setMaxWidth(width);
		majorT.setMaxWidth(width);
		cumulativeGPAT.setMaxWidth(width);
		pGPAT.setMaxWidth(width);
		mGPAT.setMaxWidth(width);
		campusT.setMaxWidth(width);
		minGPAshow.setMaxWidth(width);
		totalCredsshow.setMaxWidth(width);
		minNumshow.setMaxWidth(width);
	}

	public void createSain() {

		// Top Pane for SAIN Report
		headerBox = new HBox();
		headerH.setAlignment(Pos.CENTER);
		headerBox.getChildren().addAll(headerH);
		infoLabelBox = new VBox(8);
		infoLabelBox.getChildren().addAll(program, degree, major, cumulativeGPA, programGPA, majorGpa);
		infoTextFieldBox = new VBox();
		infoTextFieldBox.getChildren().addAll(programT, degreeT, majorT, cumulativeGPAT, pGPAT, mGPAT, campusT);
		infoBox = new HBox();
		infoBox.getChildren().addAll(infoLabelBox, infoTextFieldBox);

		VBox topPane = new VBox();
		topPane.getChildren().addAll(headerBox, infoBox);
		root.setTop(topPane);

		// Center Pane
		// Courses Taken Views
		rctBox = new VBox();
		rctBox.getChildren().addAll(requiredCourses,reqCTV);

		octBox = new VBox();
		octBox.getChildren().addAll(otherCourses, otherCTV);

		cwfBox = new VBox();
		cwfBox.getChildren().addAll(withdrew, withdrawCTV);

		ccBox = new VBox();
		ccBox.getChildren().addAll(currentCourses, currentCTV);

		coursesTakenBox = new HBox();
		coursesTakenBox.getChildren().addAll(rctBox, octBox, cwfBox, ccBox);

		// Courses Needed
		cnBox = new VBox();
		cnBox.getChildren().addAll(coursesNeeded, neededCV);
		coursesNeededBox = new HBox();
		coursesNeededBox.getChildren().addAll(rctBox, octBox, cwfBox, ccBox);


		summaryLeftLabelsBox = new VBox(8);
		summaryLeftLabelsBox.getChildren().addAll(totalCreds,minGPA,minNum);
		summaryLeftTextFieldsBox = new VBox();
		summaryLeftTextFieldsBox.getChildren().addAll(totalCredsshow,minGPAshow,minNumshow);
		summaryLeftBox = new HBox();
		summaryLeftBox.getChildren().addAll(summaryLeftTextFieldsBox,summaryLeftLabelsBox);
		summaryRightLabelsBox = new VBox(8);
		summaryRightLabelsBox.getChildren().addAll(totalCredsTakenC,totalCredsTaken,totalCreditsDegree);
		summaryRightTextFieldsBox = new VBox();
		summaryRightTextFieldsBox.getChildren().addAll(totalCredsTakenCShow,totalCredsTakenShow,totalCreditsDegreeShow);
		summaryRightBox = new HBox();
		summaryRightBox.getChildren().addAll(summaryRightTextFieldsBox,summaryRightLabelsBox);
		summaryBox = new HBox();
		summaryBox.getChildren().addAll( summaryRightBox,summaryLeftBox);
		centerPane = new VBox();
		centerPane.getChildren().addAll(coursesTakenBox, coursesNeededBox, summaryBox);
		root.setCenter(centerPane);
	}


	//Generate Getters and Setters


	public Button getSainReportButton() {
		return sainReportButton;
	}

	public Button getWhatIfButton() {
		return whatIfButton;
	}

	public void setSearchButton(Button searchButton) {
		this.searchButton = searchButton;
	}

	public void setSaveButton(Button saveButton) {
		this.saveButton = saveButton;
	}

	public Button getSearchButton() {
		return searchButton;
	}

	public Button getSaveButton() {
		return saveButton;
	}
	public VBox getBottom() {
		return bottom;
	}

	public TextField getTotalCredsTakenCShow() {
		return totalCredsTakenCShow;
	}

	public void setTotalCredsTakenCShow(String string) {
		this.totalCredsTakenCShow.setText(string);
	}

	public TextField getTotalCreditsDegreeShow() {
		return totalCreditsDegreeShow;
	}

	public void setTotalCreditsDegreeShow(String string) {
		this.totalCreditsDegreeShow.setText(string);
	}

	public TextField getTotalCredsTakenShow() {
		return totalCredsTakenShow;
	}

    public void setTotalCredsTakenShow(String string) {
		this.totalCredsTakenShow.setText(string);
	}

	public ListView getNeededCV() {
		return neededCV;
	}

	public void setNeededCV(ListView neededCV) {
		this.neededCV = neededCV;
	}

	public void setheaderH(String string) {
		this.headerH.setText(string);
	}
	public void setSainReportButtonListener(SainReportButtonListener sainReportButtonListener){
		this.sainReportButtonListener = sainReportButtonListener;
	}
	public void setWhatIfButtonListener(WhatIfButtonListener whatIfButtonListener){
		this.whatIfButtonListener = whatIfButtonListener;
	}
	public void setRoot(BorderPane root) {
		this.root = root;
	}
	public BorderPane getRoot() {
		return root;
	}
	public void setWhatIfButton(Button whatIfButton) {
		this.whatIfButton = whatIfButton;
	}
	public void setSainReportButton(Button sainReportButton) {
		this.sainReportButton = sainReportButton;
	}
	public void setBottom(VBox bottom) {
		this.bottom = bottom;
	}
	public void setprogram(Label program) {
		this.program = program;
	}
	public void setProgramT(String string) {
		programT.setText(string);
	}
	public void setdegree(Label degree) {
		this.degree = degree;
	}
	public void setDegreeT(String string) {
		degreeT.setText(string);
	}
	public void setMajorL(Label majorL) {
		this.major = majorL;
	}
	public void setMajorT(String string) {
		majorT.setText(string);
	}
	public void setCumulativeGPAL(Label cumulativeGPAL) {
		this.cumulativeGPA = cumulativeGPAL;
	}
	public void setCumulativeGPAT(double d) {
		String string = Double.toString(d);
		cumulativeGPAT.setText(string);
	}
	public void setpGPAL(Label pGPAL) {
		this.programGPA = pGPAL;
	}
	public void setPGPAT(double d) {
		String string = Double.toString(d);
		pGPAT.setText(string);
	}
	public void setMGPAL(Label mGPAL) {
		this.majorGpa = mGPAL;
	}
	public void setMGPAT(double d) {
		String string = Double.toString(d);
		mGPAT.setText(string);
	}
	public TextField getCampusT() {
		return campusT;
	}

	public void setCampusT(String string) {
		campusT.setText(string);
	}



	public void setReqCT(Label reqCT) {
		this.requiredCourses = reqCT;
	}
	public void setMinGPA(Label minGPA) {
		this.minGPA = minGPA;
	}

	public ListView getReqCTV() {
		return reqCTV;
	}
	public void setReqCTV(ListView reqCTV) {
		this.reqCTV = reqCTV;
	}
	public ListView getOtherCTV() {
		return otherCTV;
	}
	public void setOtherCTV(ListView otherCTV) {
		this.otherCTV = otherCTV;
	}
	public ListView getWithdrawCTV() {
		return withdrawCTV;
	}
	public void setWithdrawCTV(ListView<?> withdrawCTV) {
		this.withdrawCTV = withdrawCTV;
	}
	public ListView getCurrentCTV() {
		return currentCTV;
	}
	public void setCurrentCTV(ListView currentCTV) {
		this.currentCTV = currentCTV;
	}
	public void setMinGPAshow(double d) {
		String string = Double.toString(d);
		minGPAshow.setText(string);
	}
	public void setTotalCreds(Label totalCreds) {
		this.totalCreds = totalCreds;
	}
	public void setTotalCredsshow(double d) {
		String string = Double.toString(d);
		totalCredsshow.setText(string);
	}
	public void setMinNum(Label minNum) {
		this.minNum = minNum;
	}
	public void setMinNumshow(double d) {
		String string = Double.toString(d);
		minNumshow.setText(string);
	}




	public VBox getTopPane() {
		return topPane;
	}

	public void setTopPane(VBox topPane) {
		this.topPane = topPane;
	}

	public SearchButtonListener getSearchButtonListener() {
		return searchButtonListener;
	}

	public void setSearchButtonListener(SearchButtonListener searchButtonListener) {
		this.searchButtonListener = searchButtonListener;
	}

	public SaveButtonListener getSaveButtonListener() {
		return SaveButtonListener;
	}

	public void setSaveButtonListener(SaveButtonListener saveButtonListener) {
		SaveButtonListener = saveButtonListener;
	}


}