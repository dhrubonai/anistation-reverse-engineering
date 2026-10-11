package defpackage;

import com.anistation.model.settings.SubtitleStyleSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class o10 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ sb2 y;
    public final /* synthetic */ w44 z;

    public /* synthetic */ o10(sb2 sb2Var, w44 w44Var, byte b) {
        this.x = b;
        this.y = sb2Var;
        this.z = w44Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.z;
        sb2 sb2Var = this.y;
        switch (b) {
            case 0:
                w44Var.setValue(Boolean.FALSE);
                sb2Var.invoke();
                return pn6Var;
            case 1:
                sb2Var.invoke();
                w44Var.setValue(Boolean.FALSE);
                return pn6Var;
            case 2:
                sb2Var.invoke();
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                return pn6Var;
            case 3:
                w44Var.setValue(SubtitleStyleSettings.Companion.getDEFAULT());
                sb2Var.invoke();
                return pn6Var;
            default:
                w44Var.setValue(SubtitleStyleSettings.Companion.getDEFAULT());
                sb2Var.invoke();
                return pn6Var;
        }
    }
}
