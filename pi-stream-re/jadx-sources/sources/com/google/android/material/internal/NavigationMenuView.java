package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.e0;
import j.o;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements e0 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // j.e0
    public final void a(o oVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
