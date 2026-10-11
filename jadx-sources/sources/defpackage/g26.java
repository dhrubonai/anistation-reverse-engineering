package defpackage;

import com.anistation.model.settings.SubtitleStyleSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g26 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ SubtitleStyleSettings z;

    public /* synthetic */ g26(byte b, ub2 ub2Var, SubtitleStyleSettings subtitleStyleSettings) {
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
                ub2Var.invoke(SubtitleStyleSettings.copy$default(this.z, 0.0f, 0.0f, 0.0f, w65.U(((ep0) obj).a), 0, null, false, 119, null));
                return pn6Var;
            default:
                ub2Var.invoke(SubtitleStyleSettings.copy$default(this.z, 0.0f, 0.0f, 0.0f, 0, w65.U(((ep0) obj).a), null, false, 111, null));
                return pn6Var;
        }
    }
}
