package l0;

import a3.g;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.l2;
import androidx.appcompat.widget.u3;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable, c {

    /* renamed from: x, reason: collision with root package name */
    public d f6585x;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6580b = true;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f6581c = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6579a = false;

    /* renamed from: d, reason: collision with root package name */
    public int f6582d = -1;

    /* renamed from: e, reason: collision with root package name */
    public a f6583e = new a(this);

    /* renamed from: f, reason: collision with root package name */
    public l2 f6584f = new l2(this, 1);

    public b(Context context) {
    }

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f6581c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f6583e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                l2 l2Var = this.f6584f;
                if (l2Var != null) {
                    cursor2.unregisterDataSetObserver(l2Var);
                }
            }
            this.f6581c = cursor;
            if (cursor != null) {
                a aVar2 = this.f6583e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                l2 l2Var2 = this.f6584f;
                if (l2Var2 != null) {
                    cursor.registerDataSetObserver(l2Var2);
                }
                this.f6582d = cursor.getColumnIndexOrThrow("_id");
                this.f6579a = true;
                notifyDataSetChanged();
            } else {
                this.f6582d = -1;
                this.f6579a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f6579a && (cursor = this.f6581c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f6579a) {
            this.f6581c.moveToPosition(i10);
            if (view == null) {
                u3 u3Var = (u3) this;
                view = u3Var.A.inflate(u3Var.f662z, viewGroup, false);
            }
            a(view, this.f6581c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f6585x == null) {
            this.f6585x = new d(this);
        }
        return this.f6585x;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f6579a && (cursor = this.f6581c) != null) {
            cursor.moveToPosition(i10);
            return this.f6581c;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f6579a || (cursor = this.f6581c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f6581c.getLong(this.f6582d);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f6579a) {
            if (this.f6581c.moveToPosition(i10)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f6581c);
                return view;
            }
            throw new IllegalStateException(g.n("couldn't move cursor to position ", i10));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
