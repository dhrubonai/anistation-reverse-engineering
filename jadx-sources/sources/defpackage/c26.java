package defpackage;

import com.anistation.model.settings.SubtitleFontFamily;
import com.anistation.model.settings.SubtitleStyleSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class c26 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ SubtitleStyleSettings z;

    public /* synthetic */ c26(byte b, ub2 ub2Var, SubtitleStyleSettings subtitleStyleSettings) {
        this.x = b;
        this.y = ub2Var;
        this.z = subtitleStyleSettings;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                SubtitleFontFamily subtitleFontFamily = (SubtitleFontFamily) obj;
                subtitleFontFamily.getClass();
                ub2Var.invoke(SubtitleStyleSettings.copy$default(this.z, 0.0f, 0.0f, 0.0f, 0, 0, subtitleFontFamily, false, 95, null));
                return pn6Var;
            case 1:
                ub2Var.invoke(SubtitleStyleSettings.copy$default(this.z, 0.0f, 0.0f, 0.0f, 0, 0, null, ((Boolean) obj).booleanValue(), 63, null));
                return pn6Var;
            case 2:
                ub2Var.invoke(SubtitleStyleSettings.copy$default(this.z, ((Float) obj).floatValue(), 0.0f, 0.0f, 0, 0, null, false, 126, null));
                return pn6Var;
            case 3:
                ub2Var.invoke(SubtitleStyleSettings.copy$default(this.z, 0.0f, ((Float) obj).floatValue(), 0.0f, 0, 0, null, false, 125, null));
                return pn6Var;
            default:
                ub2Var.invoke(SubtitleStyleSettings.copy$default(this.z, 0.0f, 0.0f, io3.h0(((Float) obj).floatValue()), 0, 0, null, false, 123, null));
                return pn6Var;
        }
    }
}
