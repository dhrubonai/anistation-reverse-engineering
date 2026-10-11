package f8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.y0;
import com.google.firebase.auth.FirebaseAuth;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import msr.pistream.app.R;
import msr.pistream.app.ui.auth.AuthActivity;
import msr.pistream.app.ui.auth.WelcomeActivity;
import msr.pistream.app.ui.home.screens.MainActivity;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class l extends g8.b implements GeneratedComponentManagerHolder {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f3966t0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f3967n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f3968o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f3969p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f3970q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f3971r0 = false;

    /* renamed from: s0, reason: collision with root package name */
    public h f3972s0;

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // g8.b
    public final View W() {
        final int i10 = 1;
        if (FirebaseAuth.getInstance().getCurrentUser() != null) {
            if (!com.bumptech.glide.c.b0(this.f4484m0).getBoolean("auth_remember_me", true)) {
                FirebaseAuth.getInstance().signOut();
            } else {
                h hVar = this.f3972s0;
                if (hVar != null) {
                    WelcomeActivity welcomeActivity = (WelcomeActivity) hVar.f3961a;
                    welcomeActivity.startActivity(new Intent(welcomeActivity, (Class<?>) MainActivity.class).setFlags(268468224));
                    welcomeActivity.finish();
                    return null;
                }
                return null;
            }
        }
        FrameLayout frameLayout = new FrameLayout(this.f4484m0);
        int i11 = w8.i.f11062b;
        frameLayout.setBackgroundColor(i11);
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageResource(R.drawable.welcome_bg);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new k(this, imageView));
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        final int i12 = 0;
        linearLayout.addView(new View(this.f4484m0), new LinearLayout.LayoutParams(-1, 0, 0.46f));
        View view = new View(this.f4484m0);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, Color.argb(150, 10, 10, 13), i11, i11}));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, 0, 0.4f));
        View view2 = new View(this.f4484m0);
        view2.setBackgroundColor(i11);
        linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 0, 0.14f));
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(U(28), U(24), U(28), U(24));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.bottomMargin = U(48);
        frameLayout.addView(linearLayout2, layoutParams);
        TextView l10 = w8.i.l(this.f4484m0, "Welcome, Traveler.", 28, -1, 1);
        int i13 = w8.i.f11065e;
        String charSequence = l10.getText().toString();
        int lastIndexOf = charSequence.lastIndexOf("Traveler.");
        if (lastIndexOf >= 0) {
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new ForegroundColorSpan(i13), lastIndexOf, charSequence.length(), 33);
            l10.setText(spannableString);
        }
        r.f.i(-1, -2, linearLayout2, l10);
        View l11 = w8.i.l(this.f4484m0, "Carry the memories. Discover new adventures.", 16, w8.i.f11067g, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, U(8), 0, 0);
        linearLayout2.addView(l11, layoutParams2);
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        linearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, U(56));
        layoutParams3.setMargins(0, U(28), 0, 0);
        linearLayout2.addView(linearLayout3, layoutParams3);
        TextView l12 = w8.i.l(this.f4484m0, "Sign in", 16, -1, 1);
        l12.setGravity(17);
        l12.setBackground(w8.i.j(w8.i.f11063c, U(100)));
        l12.setOnClickListener(new View.OnClickListener(this) { // from class: f8.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f3963b;

            {
                this.f3963b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i14 = i12;
                l lVar = this.f3963b;
                switch (i14) {
                    case 0:
                        h hVar2 = lVar.f3972s0;
                        if (hVar2 != null) {
                            WelcomeActivity welcomeActivity2 = (WelcomeActivity) hVar2.f3961a;
                            Intent intent = new Intent(welcomeActivity2, (Class<?>) AuthActivity.class);
                            intent.putExtra("mode", "signin");
                            welcomeActivity2.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        h hVar3 = lVar.f3972s0;
                        if (hVar3 != null) {
                            WelcomeActivity welcomeActivity3 = (WelcomeActivity) hVar3.f3961a;
                            Intent intent2 = new Intent(welcomeActivity3, (Class<?>) AuthActivity.class);
                            intent2.putExtra("mode", "signup");
                            welcomeActivity3.startActivity(intent2);
                            return;
                        }
                        return;
                }
            }
        });
        a3.g.v(0, -1, 1.0f, linearLayout3, l12);
        TextView i14 = w8.i.i(this.f4484m0, "Sign Up", true);
        i14.setTextSize(16.0f);
        i14.setMinHeight(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams4.setMargins(U(14), 0, 0, 0);
        i14.setOnClickListener(new View.OnClickListener(this) { // from class: f8.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f3963b;

            {
                this.f3963b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i142 = i10;
                l lVar = this.f3963b;
                switch (i142) {
                    case 0:
                        h hVar2 = lVar.f3972s0;
                        if (hVar2 != null) {
                            WelcomeActivity welcomeActivity2 = (WelcomeActivity) hVar2.f3961a;
                            Intent intent = new Intent(welcomeActivity2, (Class<?>) AuthActivity.class);
                            intent.putExtra("mode", "signin");
                            welcomeActivity2.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        h hVar3 = lVar.f3972s0;
                        if (hVar3 != null) {
                            WelcomeActivity welcomeActivity3 = (WelcomeActivity) hVar3.f3961a;
                            Intent intent2 = new Intent(welcomeActivity3, (Class<?>) AuthActivity.class);
                            intent2.putExtra("mode", "signup");
                            welcomeActivity3.startActivity(intent2);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout3.addView(i14, layoutParams4);
        return frameLayout;
    }

    public final void X() {
        if (this.f3967n0 == null) {
            this.f3967n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f3968o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f3969p0 == null) {
            synchronized (this.f3970q0) {
                if (this.f3969p0 == null) {
                    this.f3969p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f3969p0;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f3969p0 == null) {
            synchronized (this.f3970q0) {
                if (this.f3969p0 == null) {
                    this.f3969p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f3969p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f3968o0) {
            return null;
        }
        X();
        return this.f3967n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9;
        this.T = true;
        ContextWrapper contextWrapper = this.f3967n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        X();
        if (!this.f3971r0) {
            this.f3971r0 = true;
            m mVar = (m) generatedComponent();
            mVar.getClass();
        }
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        X();
        if (!this.f3971r0) {
            this.f3971r0 = true;
            m mVar = (m) generatedComponent();
            mVar.getClass();
        }
    }
}
