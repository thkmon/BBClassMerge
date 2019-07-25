package com.bb.diff.common;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.bb.diff.date.DateUtil;
import com.bb.diff.form.button.BBButton;
import com.bb.diff.form.form.BBForm;
import com.bb.diff.form.form.DiffForm;
import com.bb.diff.form.textarea.BBEditor;
import com.bb.diff.form.tree.BBTree;
import com.bb.diff.map.FileContentMap;

public class CommonConst {
	
	public static String seqNumStr = "0";
	public static String todayDate = DateUtil.getTodayDate();
	
	public static BBForm bForm = null;
	
	public static JTextField leftFilePathText = null;
	public static JTextField rightFilePathText = null;
	
	// 좌측 트리
	public static BBTree fileTree = null;
	
	public static int textAreaTopMargin = 4;
	public static int textAreaHeight = 24;
	public static BBEditor leftFileContent = null;
	public static BBEditor rightFileContent = null;
	
	public static int fullWidth = 1024;
	public static int fullHeight = 768;
	public static int treeTopMargin = 30;
	public static int bottomMargin = 110;
	public static float treeWidthRatio = 0.18f;
	public static int treeWidth = (int) (fullWidth * treeWidthRatio);
	public static int treeLeftMargin = 4;
	
	public static BBButton winmergeButton = null;
	public static JLabel diffPointLabel = null;
	
	public static BBButton leftUpButton = null;
	public static BBButton leftDownButton = null;
	public static BBButton rightUpButton = null;
	public static BBButton rightDownButton = null;
	
	public static BBButton bothDiffButton = null;
	public static BBButton bothUpButton = null;
	public static BBButton bothDownButton = null;
	
	public static BBButton leftTopButton = null;
	public static BBButton leftBottomButton = null;
	public static BBButton rightTopButton = null;
	public static BBButton rightBottomButton = null;
	public static BBButton bothTopButton = null;
	public static BBButton bothBottomButton = null;
	
	public static int arrowButtonWidth = 44;
	public static int arrowButtonHeight = 24;
	
	public static final String FNULL = "{null}";
	public static final String FEMPTY = "{empty}";
	
	public static int movingValueOfTextArea = 40;
	
	public static final FileContentMap fileContentMap = new FileContentMap();
	
	// 공통로그  파일 패스
	public static String commonLogFilePath = "";
	// diff 후 원본 파일을 복사시킬 디렉토리 패스
	public static String commonOriginToCopyDirPath = "_origin" + CommonConst.todayDate + "_" + CommonConst.seqNumStr;
	// diff 후 대상 파일을 복사시킬 디렉토리 패스
	public static String commonTargetToCopyDirPath = "_target" + CommonConst.todayDate + "_" + CommonConst.seqNumStr;

	public static String originParentPath = "";
	public static String targetParentPath = "";

	
	// DIFF시 클래스의 경우 디컴파일하여 검사할지 여부
	public static boolean doDecompileWhenClassDiff = true;

	
	public static String includePathPattern = "*.js,*.jsp,*.xml,*.config,*.properties,*.class";
	public static String exceptPathPattern = "";
	
	// 로그파일 쓸지 여부
	public static boolean bWriteLogFile = true;
	
	
	public static DiffForm diffForm = null;
	
	
	public static ArrayList<Integer> diffPointList = new ArrayList<Integer>();
	public static int currentDiffPointIndex = -1;
	
	public static BBTree treeModel = null;
	
	// 용량차이가 0인 파일 숨기기 여부
	public static boolean bHideCapacityGapIsZero = true;
	
	// 좌측에만 있는 파일/폴더 숨기기 여부
	public static boolean bHideLeftOnlyFileDir = false;
	
	// 우측에만 있는 파일/폴더 숨기기 여부
	public static boolean bHideRightOnlyFileDir = false;
	
	// 좌측과 우측 모두 있는 파일/폴더 숨기기 여부
	public static boolean bHideBothFileDir = false;
	
	// diff 정보가 없는 빈 폴더 숨기기 여부
	public static boolean bHideEmptyDirWithNoDiff = true;
	
	// 디컴파일시 손상을 고려한 비교하기 사용 여부
	public static boolean bDiffConsideringBreakage = true;
}