package defpackage;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class km2 {
    public static final c15 a = new c15("URI=(?:\"([^\"]+)\"|([^,\\s]+))");
    public static final c15 b = new c15("RESOLUTION=(\\d+)x(\\d+)");
    public static final c15 c = new c15("avc1\\.([0-9a-fA-F]{6})");
    public static final c15 d = new c15("(?:^|,)([A-Z-]+)=(\"[^\"]*\"|[^,]*)");

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00c6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00c9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00cc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00cf. Please report as an issue. */
    public static boolean a(String str) {
        do3 do3Var;
        Integer J;
        int i;
        Matcher matcher = b.x.matcher(str);
        matcher.getClass();
        do3 do3Var2 = null;
        if (!matcher.find(0)) {
            do3Var = null;
        } else {
            do3Var = new do3(matcher, str);
        }
        if (do3Var != null) {
            Matcher matcher2 = c.x.matcher(str);
            matcher2.getClass();
            if (matcher2.find(0)) {
                do3Var2 = new do3(matcher2, str);
            }
            if (do3Var2 != null && (J = b06.J(16, uz5.u0(2, (String) ((bo3) do3Var2.a()).get(1)))) != null) {
                if (ms.U0(new Integer[]{66, 77, 88, 100}).contains(J)) {
                    Integer K = b06.K((String) ((bo3) do3Var.a()).get(1));
                    if (K != null) {
                        int intValue = K.intValue();
                        Integer K2 = b06.K((String) ((bo3) do3Var.a()).get(2));
                        if (K2 != null) {
                            int intValue2 = K2.intValue();
                            Integer J2 = b06.J(16, uz5.v0((String) ((bo3) do3Var2.a()).get(1)));
                            if (J2 != null) {
                                int intValue3 = J2.intValue();
                                if (intValue3 <= 41) {
                                    switch (intValue3) {
                                        case 10:
                                            i = 99;
                                            if (((intValue2 + 15) / 16) * ((intValue + 15) / 16) <= i) {
                                            }
                                            break;
                                        default:
                                            switch (intValue3) {
                                                case 20:
                                                    break;
                                                case 21:
                                                    i = 792;
                                                    if (((intValue2 + 15) / 16) * ((intValue + 15) / 16) <= i) {
                                                    }
                                                    break;
                                                default:
                                                    switch (intValue3) {
                                                        case 30:
                                                            break;
                                                        case 31:
                                                            i = 3600;
                                                            if (((intValue2 + 15) / 16) * ((intValue + 15) / 16) <= i) {
                                                            }
                                                            break;
                                                        case 32:
                                                            i = 5120;
                                                            if (((intValue2 + 15) / 16) * ((intValue + 15) / 16) <= i) {
                                                            }
                                                            break;
                                                        default:
                                                            switch (intValue3) {
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                                                                    i = 8192;
                                                                    if (((intValue2 + 15) / 16) * ((intValue + 15) / 16) <= i) {
                                                                    }
                                                                    break;
                                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                                                                    i = 8704;
                                                                    if (((intValue2 + 15) / 16) * ((intValue + 15) / 16) <= i) {
                                                                    }
                                                                    break;
                                                                default:
                                                                    switch (intValue3) {
                                                                        case 50:
                                                                            i = 22080;
                                                                            break;
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                                                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                                                                            i = 36864;
                                                                            break;
                                                                    }
                                                                    if (((intValue2 + 15) / 16) * ((intValue + 15) / 16) <= i) {
                                                                    }
                                                                    break;
                                                            }
                                                    }
                                                case 22:
                                                    i = 1620;
                                                    if (((intValue2 + 15) / 16) * ((intValue + 15) / 16) <= i) {
                                                    }
                                                    break;
                                            }
                                        case 11:
                                        case 12:
                                        case 13:
                                            i = 396;
                                            if (((intValue2 + 15) / 16) * ((intValue + 15) / 16) <= i) {
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
