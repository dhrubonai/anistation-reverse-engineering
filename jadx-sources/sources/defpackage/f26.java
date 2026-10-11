package defpackage;

import com.anistation.model.settings.SubtitleStyleSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class f26 extends uc2 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ w44 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f26(byte b, ub2 ub2Var, w44 w44Var) {
        super(1, q23.class, "commit", "SubtitleSettingsScreen$commit(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Lcom/anistation/model/settings/SubtitleStyleSettings;)V", 0);
        this.x = b;
        switch (b) {
            case 1:
                this.y = ub2Var;
                this.z = w44Var;
                super(1, q23.class, "commit", "SubtitleSettingsScreen$commit(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Lcom/anistation/model/settings/SubtitleStyleSettings;)V", 0);
                return;
            default:
                this.y = ub2Var;
                this.z = w44Var;
                return;
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                SubtitleStyleSettings subtitleStyleSettings = (SubtitleStyleSettings) obj;
                subtitleStyleSettings.getClass();
                SubtitleStyleSettings normalized = subtitleStyleSettings.normalized();
                w44Var.setValue(normalized);
                ub2Var.invoke(normalized);
                return pn6Var;
            default:
                SubtitleStyleSettings subtitleStyleSettings2 = (SubtitleStyleSettings) obj;
                subtitleStyleSettings2.getClass();
                SubtitleStyleSettings normalized2 = subtitleStyleSettings2.normalized();
                w44Var.setValue(normalized2);
                ub2Var.invoke(normalized2);
                return pn6Var;
        }
    }
}
