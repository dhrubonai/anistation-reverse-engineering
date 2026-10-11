package dagger.hilt.android.internal.managers;

import android.os.Bundle;
import androidx.lifecycle.o0;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.internal.Preconditions;
import y0.c;
import y0.d;

/* loaded from: classes.dex */
public final class SavedStateHandleHolder {
    private c extras;
    private o0 handle;
    private final boolean nonComponentActivity;

    public SavedStateHandleHolder(c cVar) {
        boolean z9;
        if (cVar == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.nonComponentActivity = z9;
        this.extras = cVar;
    }

    public void clear() {
        this.extras = null;
    }

    public o0 getSavedStateHandle() {
        ThreadUtil.ensureMainThread();
        Preconditions.checkState(!this.nonComponentActivity, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new Object[0]);
        o0 o0Var = this.handle;
        if (o0Var != null) {
            return o0Var;
        }
        Preconditions.checkNotNull(this.extras, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
        d dVar = new d(this.extras);
        dVar.f11463a.put(com.bumptech.glide.d.f2188c, Bundle.EMPTY);
        this.extras = dVar;
        o0 p3 = com.bumptech.glide.d.p(dVar);
        this.handle = p3;
        this.extras = null;
        return p3;
    }

    public boolean isInvalid() {
        if (this.handle == null && this.extras == null) {
            return true;
        }
        return false;
    }

    public void setExtras(c cVar) {
        if (this.handle != null) {
            return;
        }
        this.extras = cVar;
    }
}
