package defpackage;

import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tf3 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Listeners y;
    public final /* synthetic */ String z;

    public /* synthetic */ tf3(Listeners listeners, String str, byte b) {
        this.x = b;
        this.y = listeners;
        this.z = str;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        String str = this.z;
        Listeners listeners = this.y;
        switch (b) {
            case 0:
                return LegacyShowUseCase.c(listeners, str);
            case 1:
                return LegacyShowUseCase.d(listeners, str);
            case 2:
                return LegacyShowUseCase.a(listeners, str);
            default:
                return LegacyShowUseCase.b(listeners, str);
        }
    }
}
