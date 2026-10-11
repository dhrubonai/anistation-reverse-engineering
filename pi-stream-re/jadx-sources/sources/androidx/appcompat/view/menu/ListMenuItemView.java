package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.o3;
import e.a;
import g0.h0;
import g0.y0;
import j.d0;
import j.q;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements d0, AbsListView.SelectionBoundsAdjuster {
    public final Drawable A;
    public final int B;
    public final Context C;
    public boolean D;
    public final Drawable E;
    public final boolean F;
    public LayoutInflater G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public q f297a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f298b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f299c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f300d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f301e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f302f;

    /* renamed from: x, reason: collision with root package name */
    public ImageView f303x;

    /* renamed from: y, reason: collision with root package name */
    public ImageView f304y;

    /* renamed from: z, reason: collision with root package name */
    public LinearLayout f305z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o3 m5 = o3.m(getContext(), attributeSet, a.f3286r, R.attr.listMenuViewStyle);
        this.A = m5.e(5);
        this.B = m5.i(1, -1);
        this.D = m5.a(7, false);
        this.C = context;
        this.E = m5.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.F = obtainStyledAttributes.hasValue(0);
        m5.p();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.G == null) {
            this.G = LayoutInflater.from(getContext());
        }
        return this.G;
    }

    private void setSubMenuArrowVisible(boolean z9) {
        int i10;
        ImageView imageView = this.f303x;
        if (imageView != null) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f304y;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f304y.getLayoutParams();
            rect.top = this.f304y.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    @Override // j.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(j.q r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(j.q):void");
    }

    @Override // j.d0
    public q getItemData() {
        return this.f297a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = y0.f4277a;
        h0.q(this, this.A);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f300d = textView;
        int i10 = this.B;
        if (i10 != -1) {
            textView.setTextAppearance(this.C, i10);
        }
        this.f302f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f303x = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.E);
        }
        this.f304y = (ImageView) findViewById(R.id.group_divider);
        this.f305z = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f298b != null && this.D) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f298b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z9) {
        boolean z10;
        CompoundButton compoundButton;
        View view;
        if (!z9 && this.f299c == null && this.f301e == null) {
            return;
        }
        if ((this.f297a.f5594x & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f299c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f299c = radioButton;
                LinearLayout linearLayout = this.f305z;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f299c;
            view = this.f301e;
        } else {
            if (this.f301e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f301e = checkBox;
                LinearLayout linearLayout2 = this.f305z;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f301e;
            view = this.f299c;
        }
        if (z9) {
            compoundButton.setChecked(this.f297a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f301e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f299c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z9) {
        boolean z10;
        CompoundButton compoundButton;
        if ((this.f297a.f5594x & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f299c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f299c = radioButton;
                LinearLayout linearLayout = this.f305z;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f299c;
        } else {
            if (this.f301e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f301e = checkBox;
                LinearLayout linearLayout2 = this.f305z;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f301e;
        }
        compoundButton.setChecked(z9);
    }

    public void setForceShowIcon(boolean z9) {
        this.H = z9;
        this.D = z9;
    }

    public void setGroupDividerEnabled(boolean z9) {
        int i10;
        ImageView imageView = this.f304y;
        if (imageView != null) {
            if (!this.F && z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f297a.f5585n.getClass();
        boolean z9 = this.H;
        if (!z9 && !this.D) {
            return;
        }
        ImageView imageView = this.f298b;
        if (imageView == null && drawable == null && !this.D) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f298b = imageView2;
            LinearLayout linearLayout = this.f305z;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.D) {
            this.f298b.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f298b;
        if (!z9) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f298b.getVisibility() != 0) {
            this.f298b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f300d.setText(charSequence);
            if (this.f300d.getVisibility() != 0) {
                this.f300d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f300d.getVisibility() != 8) {
            this.f300d.setVisibility(8);
        }
    }
}
