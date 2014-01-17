package coupon.mai;


import org.seasar.mai.annotation.Subject;

import coupon.dto.MailAccountConfirmDto;

/**
 * メールサービス
 */
public interface MailMai {

  @Subject("テスト")
  public void sendRegistAccountMail(MailAccountConfirmDto dto);

}
