package defpackage;

import com.anistation.android.R;
import com.anistation.model.settings.SubtitleFontFamily;
import com.anistation.model.settings.SubtitleStyleSettings;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class a26 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ SubtitleStyleSettings y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ a26(byte b, ub2 ub2Var, SubtitleStyleSettings subtitleStyleSettings) {
        this.x = b;
        this.y = subtitleStyleSettings;
        this.z = ub2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.x;
        q18 q18Var = au0.a;
        pn6 pn6Var = pn6.a;
        ub2 ub2Var = this.z;
        SubtitleStyleSettings subtitleStyleSettings = this.y;
        boolean z4 = false;
        Object[] objArr = 0;
        byte b2 = 1;
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
                    String f = lz5.f(R.string.subtitle_text_color, kd2Var);
                    List list = h26.a;
                    int textColorArgb = subtitleStyleSettings.getTextColorArgb();
                    boolean f2 = kd2Var.f(ub2Var) | kd2Var.h(subtitleStyleSettings);
                    Object Q = kd2Var.Q();
                    if (f2 || Q == q18Var) {
                        Q = new g26((byte) 0, ub2Var, subtitleStyleSettings);
                        kd2Var.n0(Q);
                    }
                    wt5.b(f, list, textColorArgb, (ub2) Q, kd2Var, 0);
                    h26.b(0, kd2Var);
                    String f3 = lz5.f(R.string.subtitle_outline_color, kd2Var);
                    List list2 = h26.b;
                    int outlineColorArgb = subtitleStyleSettings.getOutlineColorArgb();
                    boolean f4 = kd2Var.f(ub2Var) | kd2Var.h(subtitleStyleSettings);
                    Object Q2 = kd2Var.Q();
                    if (f4 || Q2 == q18Var) {
                        Q2 = new g26((byte) 1, ub2Var, subtitleStyleSettings);
                        kd2Var.n0(Q2);
                    }
                    wt5.b(f3, list2, outlineColorArgb, (ub2) Q2, kd2Var, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    String f5 = lz5.f(R.string.subtitle_font_family, kd2Var2);
                    SubtitleFontFamily fontFamily = subtitleStyleSettings.getFontFamily();
                    boolean isBold = subtitleStyleSettings.isBold();
                    boolean f6 = kd2Var2.f(ub2Var) | kd2Var2.h(subtitleStyleSettings);
                    Object Q3 = kd2Var2.Q();
                    if (f6 || Q3 == q18Var) {
                        Q3 = new c26((byte) 0, ub2Var, subtitleStyleSettings);
                        kd2Var2.n0(Q3);
                    }
                    ub2 ub2Var2 = (ub2) Q3;
                    boolean f7 = kd2Var2.f(ub2Var) | kd2Var2.h(subtitleStyleSettings);
                    Object Q4 = kd2Var2.Q();
                    if (f7 || Q4 == q18Var) {
                        Q4 = new c26((byte) 1, ub2Var, subtitleStyleSettings);
                        kd2Var2.n0(Q4);
                    }
                    xt5.a(f5, fontFamily, isBold, ub2Var2, (ub2) Q4, kd2Var2, 0);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z4 = true;
                }
                if (kd2Var3.V(intValue3 & 1, z4)) {
                    h26.d(nx7.R(-1684689149, new a26(b2, ub2Var, subtitleStyleSettings), kd2Var3), kd2Var3, 6);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var4 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var4.V(intValue4 & 1, z3)) {
                    h26.d(nx7.R(1156864203, new a26(objArr == true ? 1 : 0, ub2Var, subtitleStyleSettings), kd2Var4), kd2Var4, 6);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
        }
    }
}
