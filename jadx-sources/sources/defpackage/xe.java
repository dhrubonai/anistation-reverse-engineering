package defpackage;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xe {
    public final ye a;
    public final ve b;
    public final ve c;
    public final View d;

    public xe(ye yeVar, ve veVar, ve veVar2, View view) {
        this.a = yeVar;
        this.b = veVar;
        this.c = veVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        byte b;
        byte b2;
        int i2;
        p86 p86Var = (p86) this.b.invoke();
        final byte b3 = 0;
        if (a34.i(p86Var, null)) {
            return false;
        }
        menu.clear();
        List list = p86Var.a;
        int size = list.size();
        final byte b4 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (i3 < size) {
            o86 o86Var = (o86) list.get(i3);
            int i6 = 2;
            if (o86Var instanceof w86) {
                i = i4 + 1;
                Object obj = o86Var.a;
                if (a34.i(obj, m37.k)) {
                    i2 = R.id.cut;
                } else if (a34.i(obj, m37.l)) {
                    i2 = R.id.copy;
                } else if (a34.i(obj, m37.m)) {
                    i2 = R.id.paste;
                } else if (a34.i(obj, m37.n)) {
                    i2 = R.id.selectAll;
                } else if (a34.i(obj, m37.o)) {
                    i2 = R.id.autofill;
                } else {
                    i2 = i4;
                }
                final w86 w86Var = (w86) o86Var;
                MenuItem add = menu.add(i5, i2, i4, w86Var.b);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: we
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i7;
                        byte b5 = b3;
                        Object obj2 = this;
                        Object obj3 = w86Var;
                        switch (b5) {
                            case 0:
                                ((w86) obj3).d.invoke(((xe) obj2).a);
                                return true;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                if (text != null) {
                                    i7 = text.hashCode();
                                } else {
                                    i7 = 0;
                                }
                                lz5.d(PendingIntent.getActivity(context, i7, textClassification.getIntent(), 201326592));
                                return true;
                        }
                    }
                });
            } else if (o86Var instanceof c96) {
                i = i4 + 1;
                final Context context = this.d.getContext();
                c96 c96Var = (c96) o86Var;
                final TextClassification textClassification = c96Var.b;
                int i7 = c96Var.c;
                Drawable drawable = c96Var.d;
                if (i7 < 0) {
                    MenuItem add2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
                    add2.setShowAsAction(2);
                    add2.setIcon(drawable);
                    add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: we
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            int i72;
                            byte b5 = b4;
                            Object obj2 = textClassification;
                            Object obj3 = context;
                            switch (b5) {
                                case 0:
                                    ((w86) obj3).d.invoke(((xe) obj2).a);
                                    return true;
                                default:
                                    Context context2 = (Context) obj3;
                                    TextClassification textClassification2 = (TextClassification) obj2;
                                    String text = textClassification2.getText();
                                    if (text != null) {
                                        i72 = text.hashCode();
                                    } else {
                                        i72 = 0;
                                    }
                                    lz5.d(PendingIntent.getActivity(context2, i72, textClassification2.getIntent(), 201326592));
                                    return true;
                            }
                        }
                    });
                } else {
                    if (i7 == 0) {
                        b = 1;
                    } else {
                        b = b3;
                    }
                    final RemoteAction remoteAction = textClassification.getActions().get(i7);
                    if (b != 0) {
                        b2 = 16908353;
                    } else {
                        b2 = b3;
                    }
                    MenuItem add3 = menu.add(R.id.textAssist, b2, i4, remoteAction.getTitle());
                    if (b == 0) {
                        i6 = 0;
                    }
                    add3.setShowAsAction(i6);
                    if (drawable != null) {
                        add3.setIcon(drawable);
                    }
                    add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ae6
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            lz5.d(remoteAction.getActionIntent());
                            return true;
                        }
                    });
                }
            } else {
                if (o86Var instanceof a96) {
                    i5++;
                }
                i3++;
                b3 = 0;
            }
            i4 = i;
            i3++;
            b3 = 0;
        }
        return true;
    }
}
