package com.example.portfoliobotty.client.utils;

//import org.cobogw.gwt.waveapi.gadget.client.WaveFeature;
//import com.example.portfoliobotty.client.feature.minimessages.MiniMessagesFeature;
//import com.google.gwt.gadgets.client.AnalyticsFeature;
//import com.google.gwt.gadgets.client.DynamicHeightFeature;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.user.client.Window;


public class PortfolioUtilsImpl implements PortfolioUtils {
	static PortfolioUtils instance = null;
//	private WaveFeature wave;
//	private DynamicHeightFeature height;
//	private MiniMessagesFeature messages;
//	private AnalyticsFeature analytics;

/*	
	public String getCurrentDigestId(){
		String id = wave.getPrivateState().get("digestId");
		return id != null? id : "";
	}
	public void setCurrentDigestId(String id){
		HashMap<String,String> delta = new HashMap<String, String>();
		delta.put("digestId", id);
		wave.getPrivateState().submitDelta(delta);
	}
	
	
	public String retrUserId() {
		if(wave != null && wave.getViewer() != null){
			return wave.getViewer().getId();
		}else{
			return "";
		}
		
	}
	public void adjustHeight(){
		if(height != null){
			height.adjustHeight();
		}
	}
	
	public void adjustHeightDeferred(){
		height.adjustHeight();
	}
	
	
	public String retrUserName() {
		if(wave != null && wave.getViewer() != null){
			return wave.getViewer().getDisplayName();
		}else{
			return "";
		}
		
	}
	
	public void alert(String msg) {
		messages.alert(msg);
	}	
	public void showStaticMessage(String msg) {
		messages.createStaticMessage(msg);
	}	
	public void dismissStaticMessage() {
		messages.dismissStaticMessage();
	}
	public void dismissAllStaticMessages() {
		messages.dismissAllStaticMessages();
	}
	public void showSuccessMessage(String msg, int seconds) {
		messages.showSuccessMessage(msg, seconds);
	}
	public void dismissAlert(){
		messages.dismissAlert();
	}
	
	public WaveFeature getWave() {
		return wave;
	}
	public void setWave(WaveFeature wave) {
		this.wave = wave;
	}
	public DynamicHeightFeature getHeight() {
		return height;
	}
	public void setHeight(DynamicHeightFeature height) {
		this.height = height;
	}


	public void setMiniMessages(MiniMessagesFeature mmFeature) {
		this.messages = mmFeature;
		
	}


	public void showTimerMessage(String msg, int seconds) {
		messages.createTimerMessage(msg, seconds);
		
	}


	public void setAnalytics(AnalyticsFeature analyticsFeature) {
		this.analytics = analyticsFeature; 
	}
	
	private final static String ANALYTICS_ID = "UA-13269470-3";
	public void recordPageView(String typeOfrecord) {
		analytics.recordPageView(ANALYTICS_ID, typeOfrecord);
	}
	*/
	
	
	public void showStaticMessage(String msg) {
	}	
	public void dismissStaticMessage() {
	}
	public void dismissAllStaticMessages() {
	}
	public void showSuccessMessage(String msg, int seconds) {
		Window.alert(msg);
	}
	public void recordPageView(String typeOfrecord) {
	}
	
	public String retrUserId() {
		return "vega113@googlewave.com";
		
	}
	public String retrUserName() {
		return "Yuri Zelikov";
		
	}
	public void adjustHeight(){
	}
	public void alert(String msg) {
		Window.alert(msg);
	}	
	public void dismissAlert(){
	}

	private static HashMap<String,String> privateState = new HashMap<String, String>();
	public void putToPrivateSate(String key, String value){
		privateState.put(key, value);
	}
	public String retrFromPrivateSate(String key){
		return privateState.get(key);
	}
	@Override
	public String retrHostId() {
		return "vega114@googlewave.com";
	}
	@Override
	public void requestNavigateTo(String discussFinanceBottyWaveView,
			Object object) {
		// TODO Auto-generated method stub
		
	}
	
	
}
