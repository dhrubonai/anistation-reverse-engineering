package f;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final e f3730a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3731b;

    public i(Context context) {
        this(context, j.o(context, 0));
    }

    public j create() {
        int i10;
        e eVar = this.f3730a;
        j jVar = new j(eVar.f3646a, this.f3731b);
        View view = eVar.f3650e;
        h hVar = jVar.f3738e;
        int i11 = 0;
        if (view != null) {
            hVar.B = view;
        } else {
            CharSequence charSequence = eVar.f3649d;
            if (charSequence != null) {
                hVar.f3708e = charSequence;
                TextView textView = hVar.f3728z;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = eVar.f3648c;
            if (drawable != null) {
                hVar.f3726x = drawable;
                hVar.f3725w = 0;
                ImageView imageView = hVar.f3727y;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    hVar.f3727y.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = eVar.f3651f;
        if (charSequence2 != null) {
            hVar.e(-1, charSequence2, eVar.f3652g);
        }
        CharSequence charSequence3 = eVar.f3653h;
        if (charSequence3 != null) {
            hVar.e(-2, charSequence3, eVar.f3654i);
        }
        if (eVar.f3656k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) eVar.f3647b.inflate(hVar.F, (ViewGroup) null);
            if (eVar.f3659n) {
                i10 = hVar.G;
            } else {
                i10 = hVar.H;
            }
            ListAdapter listAdapter = eVar.f3656k;
            if (listAdapter == null) {
                listAdapter = new g(eVar.f3646a, i10);
            }
            hVar.C = listAdapter;
            hVar.D = eVar.o;
            if (eVar.f3657l != null) {
                alertController$RecycleListView.setOnItemClickListener(new d(i11, eVar, hVar));
            }
            if (eVar.f3659n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            hVar.f3709f = alertController$RecycleListView;
        }
        View view2 = eVar.f3658m;
        if (view2 != null) {
            hVar.f3710g = view2;
            hVar.f3711h = 0;
            hVar.f3712i = false;
        }
        jVar.setCancelable(true);
        jVar.setCanceledOnTouchOutside(true);
        jVar.setOnCancelListener(null);
        jVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = eVar.f3655j;
        if (onKeyListener != null) {
            jVar.setOnKeyListener(onKeyListener);
        }
        return jVar;
    }

    public Context getContext() {
        return this.f3730a.f3646a;
    }

    public i setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        e eVar = this.f3730a;
        eVar.f3653h = eVar.f3646a.getText(i10);
        eVar.f3654i = onClickListener;
        return this;
    }

    public i setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        e eVar = this.f3730a;
        eVar.f3651f = eVar.f3646a.getText(i10);
        eVar.f3652g = onClickListener;
        return this;
    }

    public i setTitle(CharSequence charSequence) {
        this.f3730a.f3649d = charSequence;
        return this;
    }

    public i setView(View view) {
        this.f3730a.f3658m = view;
        return this;
    }

    public i(Context context, int i10) {
        this.f3730a = new e(new ContextThemeWrapper(context, j.o(context, i10)));
        this.f3731b = i10;
    }
}
