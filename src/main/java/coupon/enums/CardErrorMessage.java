package coupon.enums;

import org.apache.commons.lang.StringUtils;

public enum CardErrorMessage {

	INVALID_NUMBER(1,"カード番号が不正です", "cardNo"),
	INCORRECT_NUMBER(2,"カード番号が違います", "cardNo"),
	INVALID_NAME(3,"カード名義のフォーマットが不正です", "cardName"),
	INVALID_EXPIRY_MONTH(4,"カードの有効期限月が不正です", "month"),
	INVALID_EXPIRY_YEAR(5,"カードの有効期限年が不正です", "year"),
	INVALID_EXPIRY(6,"カードの有効期限が不正です", "month"),
	INCORRECT_EXPIRY(7,"有効期限に誤りがあります", "month"),
	INVALID_CVC(8,"CVCセキュリティコードが不正です", "cvc"),
	INCORRECT_CVC(9,"CVCが間違っています", "cvc"),
	CARD_DECLINED(10,"カードが決済に失敗しました", ""),
	MISSING(11,"請求を行った顧客にカードが紐付いていません", ""),
	PROCESSING_ERROR(12,"処理中にエラーが発生しました", ""),
	;
	
	
	/** DB上の区分 */
	public Integer key;
	
	public String msg;
	
	public String tagId;

	private CardErrorMessage(Integer key, String msg, String tagId) {
		this.key = key;
		this.msg = msg;
		this.tagId = tagId;
	}
	
	
	public static CardErrorMessage getEnum(String code) {
		for (CardErrorMessage msg : CardErrorMessage.values()) {
			if (StringUtils.equals(msg.toString(), code.toUpperCase())) {
				return msg;
			}
		}
		return PROCESSING_ERROR;
	}


	public String getMsg() {
		return msg;
	}


	public Integer getKey() {
		return key;
	}


	public String getTagId() {
		return tagId;
	}
}
