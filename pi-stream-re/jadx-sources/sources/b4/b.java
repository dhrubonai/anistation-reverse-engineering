package b4;

import android.content.res.AssetManager;

/* loaded from: classes.dex */
public final class b implements y, a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1436a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f1437b;

    public /* synthetic */ b(AssetManager assetManager, int i10) {
        this.f1436a = i10;
        this.f1437b = assetManager;
    }

    @Override // b4.y
    public final x j(c0 c0Var) {
        int i10 = this.f1436a;
        AssetManager assetManager = this.f1437b;
        switch (i10) {
            case 0:
                return new c(assetManager, this);
            default:
                return new c(assetManager, this);
        }
    }
}
