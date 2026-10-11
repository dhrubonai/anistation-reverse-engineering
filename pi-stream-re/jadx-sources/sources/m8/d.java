package m8;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7581c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f7579a = i10;
        this.f7580b = obj;
        this.f7581c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        int parseColor;
        int i10 = this.f7579a;
        Object obj = this.f7581c;
        Object obj2 = this.f7580b;
        switch (i10) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                if (z9 != ((h) obj2).f7608f) {
                    onClickListener.onClick(compoundButton);
                    return;
                }
                return;
            default:
                Switch r22 = (Switch) obj2;
                Consumer consumer = (Consumer) obj;
                if (z9) {
                    parseColor = w8.i.f11065e;
                } else {
                    parseColor = Color.parseColor("#888888");
                }
                r22.setThumbTintList(ColorStateList.valueOf(parseColor));
                if (consumer != null) {
                    consumer.accept(Boolean.valueOf(z9));
                    return;
                }
                return;
        }
    }
}
