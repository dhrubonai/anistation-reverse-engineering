package defpackage;

import com.anistation.android.R;
import com.anistation.model.settings.SubtitleStyleSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b26 implements jc2 {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ SubtitleStyleSettings y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ b26(SubtitleStyleSettings subtitleStyleSettings, ub2 ub2Var, sb2 sb2Var, byte b) {
        this.x = b;
        this.y = subtitleStyleSettings;
        this.z = ub2Var;
        this.A = sb2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ub2 ub2Var = this.z;
        SubtitleStyleSettings subtitleStyleSettings = this.y;
        byte b2 = 0;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    String f = lz5.f(R.string.subtitle_font_size, kd2Var);
                    String str2 = io3.h0(subtitleStyleSettings.getFontScale() * 100.0f) + "%";
                    float fontScale = subtitleStyleSettings.getFontScale();
                    do0 do0Var = new do0(0.7f, 1.6f);
                    boolean f2 = kd2Var.f(ub2Var) | kd2Var.h(subtitleStyleSettings);
                    Object Q = kd2Var.Q();
                    q18 q18Var = au0.a;
                    if (f2 || Q == q18Var) {
                        Q = new c26((byte) 2, ub2Var, subtitleStyleSettings);
                        kd2Var.n0(Q);
                    }
                    sb2 sb2Var = this.A;
                    yu5.a(f, str2, fontScale, do0Var, (ub2) Q, sb2Var, 0, kd2Var, 0, 64);
                    h26.b(0, kd2Var);
                    String f3 = lz5.f(R.string.subtitle_vertical_position, kd2Var);
                    String str3 = io3.h0(subtitleStyleSettings.getVerticalPosition() * 100.0f) + "%";
                    float verticalPosition = subtitleStyleSettings.getVerticalPosition();
                    do0 do0Var2 = new do0(0.55f, 1.0f);
                    boolean f4 = kd2Var.f(ub2Var) | kd2Var.h(subtitleStyleSettings);
                    Object Q2 = kd2Var.Q();
                    if (f4 || Q2 == q18Var) {
                        Q2 = new c26((byte) 3, ub2Var, subtitleStyleSettings);
                        kd2Var.n0(Q2);
                    }
                    yu5.a(f3, str3, verticalPosition, do0Var2, (ub2) Q2, sb2Var, 0, kd2Var, 0, 64);
                    h26.b(0, kd2Var);
                    String f5 = lz5.f(R.string.subtitle_outline_thickness, kd2Var);
                    if (subtitleStyleSettings.getOutlineWidthDp() == 0.0f) {
                        str = h11.i(kd2Var, 525591762, R.string.off, kd2Var, false);
                    } else {
                        kd2Var.e0(525665573);
                        kd2Var.q(false);
                        str = io3.h0(subtitleStyleSettings.getOutlineWidthDp()) + " dp";
                    }
                    String str4 = str;
                    float outlineWidthDp = subtitleStyleSettings.getOutlineWidthDp();
                    do0 do0Var3 = new do0(0.0f, 3.0f);
                    boolean f6 = kd2Var.f(ub2Var) | kd2Var.h(subtitleStyleSettings);
                    Object Q3 = kd2Var.Q();
                    if (f6 || Q3 == q18Var) {
                        Q3 = new c26((byte) 4, ub2Var, subtitleStyleSettings);
                        kd2Var.n0(Q3);
                    }
                    yu5.a(f5, str4, outlineWidthDp, do0Var3, (ub2) Q3, sb2Var, 2, kd2Var, 1572864, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    h26.d(nx7.R(1572191020, new b26(subtitleStyleSettings, ub2Var, this.A, b2), kd2Var2), kd2Var2, 6);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
