package f8;

import android.os.Bundle;
import androidx.lifecycle.y0;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import l8.c0;
import l8.p;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public abstract class g extends g8.a implements GeneratedComponentManagerHolder {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3956b;

    /* renamed from: c, reason: collision with root package name */
    public SavedStateHandleHolder f3957c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ActivityComponentManager f3958d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3959e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3960f;

    public g(int i10) {
        this.f3956b = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f3959e = new Object();
                    this.f3960f = false;
                    m();
                    return;
                } else {
                    this.f3959e = new Object();
                    this.f3960f = false;
                    m();
                    return;
                }
            }
            this.f3959e = new Object();
            this.f3960f = false;
            m();
            return;
        }
        this.f3959e = new Object();
        this.f3960f = false;
        m();
    }

    private final ActivityComponentManager o() {
        if (this.f3958d == null) {
            synchronized (this.f3959e) {
                if (this.f3958d == null) {
                    this.f3958d = r();
                }
            }
        }
        return this.f3958d;
    }

    private final ActivityComponentManager p() {
        if (this.f3958d == null) {
            synchronized (this.f3959e) {
                if (this.f3958d == null) {
                    this.f3958d = r();
                }
            }
        }
        return this.f3958d;
    }

    private final ActivityComponentManager q() {
        if (this.f3958d == null) {
            synchronized (this.f3959e) {
                if (this.f3958d == null) {
                    this.f3958d = r();
                }
            }
        }
        return this.f3958d;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final /* bridge */ /* synthetic */ GeneratedComponentManager componentManager() {
        switch (this.f3956b) {
            case 0:
                return n();
            case 1:
                return n();
            case 2:
                return n();
            default:
                return n();
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        switch (this.f3956b) {
            case 0:
                return n().generatedComponent();
            case 1:
                return n().generatedComponent();
            case 2:
                return n().generatedComponent();
            default:
                return n().generatedComponent();
        }
    }

    @Override // androidx.activity.j, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        switch (this.f3956b) {
            case 0:
                return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
            case 1:
                return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
            case 2:
                return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
            default:
                return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
        }
    }

    public final void m() {
        switch (this.f3956b) {
            case 0:
                addOnContextAvailableListener(new f.l(this, 1));
                return;
            case 1:
                addOnContextAvailableListener(new f.l(this, 2));
                return;
            case 2:
                addOnContextAvailableListener(new p(this));
                return;
            default:
                addOnContextAvailableListener(new n8.b(this));
                return;
        }
    }

    public final ActivityComponentManager n() {
        switch (this.f3956b) {
            case 0:
                if (this.f3958d == null) {
                    synchronized (this.f3959e) {
                        if (this.f3958d == null) {
                            this.f3958d = r();
                        }
                    }
                }
                return this.f3958d;
            case 1:
                return o();
            case 2:
                return p();
            default:
                return q();
        }
    }

    @Override // androidx.fragment.app.b0, androidx.activity.j, w.n, android.app.Activity
    public void onCreate(Bundle bundle) {
        switch (this.f3956b) {
            case 0:
                super.onCreate(bundle);
                s();
                return;
            case 1:
                super.onCreate(bundle);
                s();
                return;
            case 2:
                super.onCreate(bundle);
                s();
                return;
            default:
                super.onCreate(bundle);
                s();
                return;
        }
    }

    @Override // androidx.appcompat.app.a, androidx.fragment.app.b0, android.app.Activity
    public void onDestroy() {
        switch (this.f3956b) {
            case 0:
                super.onDestroy();
                SavedStateHandleHolder savedStateHandleHolder = this.f3957c;
                if (savedStateHandleHolder != null) {
                    savedStateHandleHolder.clear();
                    return;
                }
                return;
            case 1:
                super.onDestroy();
                SavedStateHandleHolder savedStateHandleHolder2 = this.f3957c;
                if (savedStateHandleHolder2 != null) {
                    savedStateHandleHolder2.clear();
                    return;
                }
                return;
            case 2:
                super.onDestroy();
                SavedStateHandleHolder savedStateHandleHolder3 = this.f3957c;
                if (savedStateHandleHolder3 != null) {
                    savedStateHandleHolder3.clear();
                    return;
                }
                return;
            default:
                super.onDestroy();
                SavedStateHandleHolder savedStateHandleHolder4 = this.f3957c;
                if (savedStateHandleHolder4 != null) {
                    savedStateHandleHolder4.clear();
                    return;
                }
                return;
        }
    }

    public final ActivityComponentManager r() {
        switch (this.f3956b) {
            case 0:
                return new ActivityComponentManager(this);
            case 1:
                return new ActivityComponentManager(this);
            case 2:
                return new ActivityComponentManager(this);
            default:
                return new ActivityComponentManager(this);
        }
    }

    public final void s() {
        switch (this.f3956b) {
            case 0:
                if (getApplication() instanceof GeneratedComponentManager) {
                    SavedStateHandleHolder savedStateHandleHolder = n().getSavedStateHandleHolder();
                    this.f3957c = savedStateHandleHolder;
                    if (savedStateHandleHolder.isInvalid()) {
                        this.f3957c.setExtras(getDefaultViewModelCreationExtras());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (getApplication() instanceof GeneratedComponentManager) {
                    SavedStateHandleHolder savedStateHandleHolder2 = n().getSavedStateHandleHolder();
                    this.f3957c = savedStateHandleHolder2;
                    if (savedStateHandleHolder2.isInvalid()) {
                        this.f3957c.setExtras(getDefaultViewModelCreationExtras());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (getApplication() instanceof GeneratedComponentManager) {
                    SavedStateHandleHolder savedStateHandleHolder3 = n().getSavedStateHandleHolder();
                    this.f3957c = savedStateHandleHolder3;
                    if (savedStateHandleHolder3.isInvalid()) {
                        this.f3957c.setExtras(getDefaultViewModelCreationExtras());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (getApplication() instanceof GeneratedComponentManager) {
                    SavedStateHandleHolder savedStateHandleHolder4 = n().getSavedStateHandleHolder();
                    this.f3957c = savedStateHandleHolder4;
                    if (savedStateHandleHolder4.isInvalid()) {
                        this.f3957c.setExtras(getDefaultViewModelCreationExtras());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void t() {
        switch (this.f3956b) {
            case 0:
                if (!this.f3960f) {
                    this.f3960f = true;
                    a aVar = (a) generatedComponent();
                    aVar.getClass();
                    return;
                }
                return;
            case 1:
                if (!this.f3960f) {
                    this.f3960f = true;
                    i iVar = (i) generatedComponent();
                    iVar.getClass();
                    return;
                }
                return;
            case 2:
                if (!this.f3960f) {
                    this.f3960f = true;
                    c0 c0Var = (c0) generatedComponent();
                    ((MainActivity) UnsafeCasts.unsafeCast(this)).f7749z = (y7.a) ((x7.a) c0Var).f11343a.f11359e.get();
                    return;
                }
                return;
            default:
                if (!this.f3960f) {
                    this.f3960f = true;
                    n8.f fVar = (n8.f) generatedComponent();
                    ((PlayerActivity) UnsafeCasts.unsafeCast(this)).N = (e8.a) ((x7.a) fVar).f11343a.f11362h.get();
                    return;
                }
                return;
        }
    }
}
