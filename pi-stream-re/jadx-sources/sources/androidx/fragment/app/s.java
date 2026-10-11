package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class s extends com.bumptech.glide.c {
    public final /* synthetic */ y C;

    public s(y yVar) {
        this.C = yVar;
    }

    @Override // com.bumptech.glide.c
    public final View P(int i10) {
        y yVar = this.C;
        View view = yVar.V;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException(a3.g.r("Fragment ", yVar, " does not have a view"));
    }

    @Override // com.bumptech.glide.c
    public final boolean Q() {
        if (this.C.V != null) {
            return true;
        }
        return false;
    }
}
