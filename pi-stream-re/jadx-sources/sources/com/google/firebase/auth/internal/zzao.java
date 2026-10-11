package com.google.firebase.auth.internal;

import android.text.TextUtils;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.firebase.FirebaseError;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzao {
    private static Status zza(String str, String str2) {
        int i10;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c6 = 0;
                    break;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c6 = 1;
                    break;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c6 = 2;
                    break;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c6 = 3;
                    break;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c6 = 4;
                    break;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c6 = 5;
                    break;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c6 = 6;
                    break;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c6 = 7;
                    break;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c6 = '\b';
                    break;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c6 = '\t';
                    break;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c6 = '\n';
                    break;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    c6 = 11;
                    break;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c6 = '\f';
                    break;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c6 = '\r';
                    break;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c6 = 14;
                    break;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c6 = 15;
                    break;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c6 = 16;
                    break;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c6 = 17;
                    break;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c6 = 18;
                    break;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c6 = 19;
                    break;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c6 = 20;
                    break;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c6 = 21;
                    break;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c6 = 22;
                    break;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c6 = 23;
                    break;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c6 = 24;
                    break;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c6 = 25;
                    break;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c6 = 26;
                    break;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c6 = 27;
                    break;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c6 = 28;
                    break;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c6 = 29;
                    break;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    c6 = 30;
                    break;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c6 = 31;
                    break;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c6 = ' ';
                    break;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c6 = '!';
                    break;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c6 = '\"';
                    break;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c6 = '#';
                    break;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c6 = '$';
                    break;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c6 = '%';
                    break;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c6 = '&';
                    break;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c6 = '\'';
                    break;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c6 = '(';
                    break;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c6 = ')';
                    break;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c6 = '*';
                    break;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c6 = '+';
                    break;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c6 = ',';
                    break;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c6 = '-';
                    break;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c6 = '.';
                    break;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c6 = '/';
                    break;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c6 = '0';
                    break;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c6 = '1';
                    break;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c6 = '2';
                    break;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c6 = '3';
                    break;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c6 = '4';
                    break;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c6 = '5';
                    break;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c6 = '6';
                    break;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c6 = '7';
                    break;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c6 = '8';
                    break;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c6 = '9';
                    break;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c6 = ':';
                    break;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c6 = ';';
                    break;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c6 = '<';
                    break;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c6 = '=';
                    break;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c6 = '>';
                    break;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c6 = '?';
                    break;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c6 = '@';
                    break;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c6 = 'A';
                    break;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c6 = 'B';
                    break;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c6 = 'C';
                    break;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c6 = 'D';
                    break;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c6 = 'E';
                    break;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c6 = 'F';
                    break;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c6 = 'G';
                    break;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c6 = 'H';
                    break;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c6 = 'I';
                    break;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c6 = 'J';
                    break;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c6 = 'K';
                    break;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c6 = 'L';
                    break;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c6 = 'M';
                    break;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c6 = 'N';
                    break;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c6 = 'O';
                    break;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c6 = 'P';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                i10 = 18001;
                break;
            case 1:
                i10 = 17033;
                break;
            case 2:
                i10 = 17057;
                break;
            case 3:
                i10 = 17091;
                break;
            case 4:
            case 30:
            case '?':
                i10 = FirebaseError.ERROR_INVALID_CREDENTIAL;
                break;
            case 5:
                i10 = 17068;
                break;
            case 6:
                i10 = 17052;
                break;
            case zzaja.zze.zzg /* 7 */:
                i10 = 17061;
                break;
            case '\b':
                i10 = 17206;
                break;
            case '\t':
                i10 = 17200;
                break;
            case '\n':
                i10 = 17029;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                i10 = 17038;
                break;
            case '\f':
                i10 = 17030;
                break;
            case '\r':
                i10 = 17034;
                break;
            case 14:
                i10 = 17044;
                break;
            case 15:
                i10 = FirebaseError.ERROR_USER_TOKEN_EXPIRED;
                break;
            case 16:
                i10 = 17079;
                break;
            case 17:
                i10 = 18002;
                break;
            case 18:
                i10 = 17046;
                break;
            case 19:
                i10 = 17087;
                break;
            case 20:
            case 'H':
                i10 = FirebaseError.ERROR_INVALID_EMAIL;
                break;
            case 21:
                i10 = 17085;
                break;
            case 22:
                i10 = 17094;
                break;
            case 23:
                i10 = 17064;
                break;
            case 24:
                i10 = FirebaseError.ERROR_NO_SUCH_PROVIDER;
                break;
            case 25:
                i10 = 17084;
                break;
            case 26:
                i10 = 17035;
                break;
            case 27:
                i10 = FirebaseError.ERROR_REQUIRES_RECENT_LOGIN;
                break;
            case 28:
            case 'B':
                i10 = FirebaseError.ERROR_NETWORK_REQUEST_FAILED;
                break;
            case 29:
                i10 = 17207;
                break;
            case 31:
                i10 = 17203;
                break;
            case ' ':
            case '3':
                i10 = FirebaseError.ERROR_OPERATION_NOT_ALLOWED;
                break;
            case '!':
                i10 = 17062;
                break;
            case '\"':
                i10 = 17088;
                break;
            case '#':
                i10 = 17082;
                break;
            case '$':
            case '\'':
                i10 = FirebaseError.ERROR_USER_NOT_FOUND;
                break;
            case '%':
                i10 = 17056;
                break;
            case '&':
                i10 = FirebaseError.ERROR_WEAK_PASSWORD;
                break;
            case '(':
                i10 = 17089;
                break;
            case ')':
                i10 = 17032;
                break;
            case '*':
                i10 = 17041;
                break;
            case '+':
                i10 = 17074;
                break;
            case ',':
                i10 = 17081;
                break;
            case '-':
                i10 = 17095;
                break;
            case '.':
                i10 = FirebaseError.ERROR_EMAIL_ALREADY_IN_USE;
                break;
            case '/':
                i10 = FirebaseError.ERROR_INVALID_USER_TOKEN;
                break;
            case '0':
                i10 = 17065;
                break;
            case '1':
                i10 = 17204;
                break;
            case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                i10 = 17205;
                break;
            case '4':
                i10 = 17086;
                break;
            case '5':
                i10 = 17075;
                break;
            case '6':
                i10 = 17083;
                break;
            case '7':
                i10 = 17049;
                break;
            case '8':
                i10 = 17071;
                break;
            case '9':
                i10 = FirebaseError.ERROR_CUSTOM_TOKEN_MISMATCH;
                break;
            case ':':
                i10 = 17058;
                break;
            case ';':
                i10 = 17078;
                break;
            case '<':
                i10 = 17093;
                break;
            case '=':
                i10 = 17031;
                break;
            case '>':
            case 'L':
                i10 = FirebaseError.ERROR_TOO_MANY_REQUESTS;
                break;
            case '@':
                i10 = FirebaseError.ERROR_INVALID_CUSTOM_TOKEN;
                break;
            case 'A':
                i10 = FirebaseError.ERROR_WRONG_PASSWORD;
                break;
            case 'C':
                i10 = 17202;
                break;
            case 'D':
                i10 = 17051;
                break;
            case 'E':
                i10 = 17043;
                break;
            case 'F':
                i10 = FirebaseError.ERROR_CREDENTIAL_ALREADY_IN_USE;
                break;
            case 'G':
                i10 = 17201;
                break;
            case 'I':
                i10 = FirebaseError.ERROR_USER_DISABLED;
                break;
            case 'J':
                i10 = 17042;
                break;
            case 'K':
                i10 = FirebaseError.ERROR_APP_NOT_AUTHORIZED;
                break;
            case 'M':
                i10 = 17040;
                break;
            case 'N':
                i10 = 17045;
                break;
            case 'O':
                i10 = 17090;
                break;
            case 'P':
                i10 = 17073;
                break;
            default:
                i10 = 17499;
                break;
        }
        if (i10 != 17499) {
            return new Status(i10, str2);
        }
        if (str2 != null) {
            return new Status(i10, str + ":" + str2);
        }
        return new Status(i10, str);
    }

    public static Status zza(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(FirebaseError.ERROR_INTERNAL_ERROR, null);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return zza((String) asList.get(0), (String) asList.get(1));
        }
        return zza((String) asList.get(0), null);
    }
}
