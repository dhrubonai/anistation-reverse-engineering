package defpackage;

import com.anistation.model.settings.SubtitleStyleSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class zj1 extends uc2 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj1(w44 w44Var, byte b) {
        super(1, q23.class, "toggleEpisodeSelection", "DownloadListScreen$toggleEpisodeSelection(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", 0);
        this.x = b;
        switch (b) {
            case 1:
                this.y = w44Var;
                super(1, q23.class, "toggleEpisodeSelection", "DownloadListScreen$toggleEpisodeSelection(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", 0);
                return;
            case 2:
                this.y = w44Var;
                super(1, q23.class, "updateDraft", "SubtitleSettingsScreen$updateDraft(Landroidx/compose/runtime/MutableState;Lcom/anistation/model/settings/SubtitleStyleSettings;)V", 0);
                return;
            case 3:
                this.y = w44Var;
                super(1, q23.class, "updateDraft", "SubtitleSettingsScreen$updateDraft(Landroidx/compose/runtime/MutableState;Lcom/anistation/model/settings/SubtitleStyleSettings;)V", 0);
                return;
            default:
                this.y = w44Var;
                return;
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                dk1.f((w44) obj2, str);
                return pn6Var;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                dk1.f((w44) obj2, str2);
                return pn6Var;
            case 2:
                SubtitleStyleSettings subtitleStyleSettings = (SubtitleStyleSettings) obj;
                subtitleStyleSettings.getClass();
                ((w44) obj2).setValue(subtitleStyleSettings);
                return pn6Var;
            case 3:
                SubtitleStyleSettings subtitleStyleSettings2 = (SubtitleStyleSettings) obj;
                subtitleStyleSettings2.getClass();
                ((w44) obj2).setValue(subtitleStyleSettings2);
                return pn6Var;
            default:
                float[] fArr = ((jo3) obj).a;
                ha3 ha3Var = (ha3) ((nf3) obj2).O.getValue();
                if (ha3Var != null) {
                    if (!ha3Var.m()) {
                        ha3Var = null;
                    }
                    if (ha3Var != null) {
                        ha3Var.h(fArr);
                    }
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj1(nf3 nf3Var) {
        super(1, q23.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.x = (byte) 4;
        this.y = nf3Var;
    }
}
