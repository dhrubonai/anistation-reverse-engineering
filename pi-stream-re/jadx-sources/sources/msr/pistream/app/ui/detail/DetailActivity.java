package msr.pistream.app.ui.detail;

import a8.b;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.s0;
import androidx.lifecycle.y0;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import f.l;
import g8.a;
import h8.e;
import h8.k;
import msr.pistream.app.R;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class DetailActivity extends a implements GeneratedComponentManagerHolder {

    /* renamed from: b, reason: collision with root package name */
    public SavedStateHandleHolder f7736b;

    /* renamed from: c, reason: collision with root package name */
    public volatile ActivityComponentManager f7737c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7738d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f7739e = false;

    /* renamed from: f, reason: collision with root package name */
    public k f7740f;

    public DetailActivity() {
        addOnContextAvailableListener(new l(this, 3));
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.pop_left_in, R.anim.pop_right_out);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.j, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.f7737c == null) {
            synchronized (this.f7738d) {
                if (this.f7737c == null) {
                    this.f7737c = new ActivityComponentManager(this);
                }
            }
        }
        return this.f7737c;
    }

    public final void n(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof GeneratedComponentManager) {
            SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
            this.f7736b = savedStateHandleHolder;
            if (savedStateHandleHolder.isInvalid()) {
                this.f7736b.setExtras(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // androidx.appcompat.app.a, androidx.fragment.app.b0, android.app.Activity
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.f7736b;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }

    @Override // androidx.fragment.app.b0, androidx.activity.j, w.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        b bVar = (b) getIntent().getParcelableExtra("anime");
        if (bVar == null) {
            finish();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(View.generateViewId());
        frameLayout.setFitsSystemWindows(true);
        ProgressBar progressBar = new ProgressBar(this, null, android.R.attr.progressBarStyleLarge);
        progressBar.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        setContentView(frameLayout);
        if (bundle == null) {
            k kVar = new k();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("anime", bVar);
            kVar.S(bundle2);
            this.f7740f = kVar;
            s0 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.g(frameLayout.getId(), this.f7740f, "detail_fragment", 1);
            aVar.d(false);
        } else {
            this.f7740f = (k) getSupportFragmentManager().C("detail_fragment");
        }
        frameLayout.getViewTreeObserver().addOnPreDrawListener(new e(this, frameLayout, progressBar));
    }
}
