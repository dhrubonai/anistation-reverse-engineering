package dagger.hilt.android.lifecycle;

import androidx.lifecycle.w0;
import h7.l;
import i7.h;

/* loaded from: classes.dex */
public final class HiltViewModelExtensions$addCreationCallback$1$1 extends h implements l {
    final /* synthetic */ l $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiltViewModelExtensions$addCreationCallback$1$1(l lVar) {
        super(1);
        this.$callback = lVar;
    }

    @Override // h7.l
    public final w0 invoke(Object obj) {
        return (w0) this.$callback.invoke(obj);
    }
}
