.class public final Landroidx/appcompat/widget/t0;
.super Landroidx/appcompat/widget/o2;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/v0;


# instance fields
.field public U:Ljava/lang/CharSequence;

.field public V:Landroid/widget/ListAdapter;

.field public final W:Landroid/graphics/Rect;

.field public X:I

.field public final synthetic Y:Landroidx/appcompat/widget/w0;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/w0;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/t0;->Y:Landroidx/appcompat/widget/w0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const v1, 0x7f0403d0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2, p3, v1, v0}, Landroidx/appcompat/widget/o2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    .line 9
    .line 10
    new-instance p2, Landroid/graphics/Rect;

    .line 11
    .line 12
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Landroidx/appcompat/widget/t0;->W:Landroid/graphics/Rect;

    .line 16
    .line 17
    iput-object p1, p0, Landroidx/appcompat/widget/o2;->F:Landroid/view/View;

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    iput-boolean p2, p0, Landroidx/appcompat/widget/o2;->P:Z

    .line 21
    .line 22
    iget-object p3, p0, Landroidx/appcompat/widget/o2;->Q:Landroidx/appcompat/widget/g0;

    .line 23
    .line 24
    invoke-virtual {p3, p2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 25
    .line 26
    .line 27
    new-instance p3, Lf/d;

    .line 28
    .line 29
    invoke-direct {p3, p2, p0, p1}, Lf/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p3, p0, Landroidx/appcompat/widget/o2;->G:Landroid/widget/AdapterView$OnItemClickListener;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/t0;->U:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-void
.end method

.method public final k(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/t0;->X:I

    .line 2
    .line 3
    return-void
.end method

.method public final m(II)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/o2;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/t0;->s()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    iget-object v2, p0, Landroidx/appcompat/widget/o2;->Q:Landroidx/appcompat/widget/g0;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/appcompat/widget/o2;->d()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v1, v3}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, p1}, Landroidx/appcompat/widget/o0;->d(Landroid/view/View;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, p2}, Landroidx/appcompat/widget/o0;->c(Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Landroidx/appcompat/widget/t0;->Y:Landroidx/appcompat/widget/w0;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v1, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/appcompat/widget/o2;->b()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/b2;->setListSelectionHidden(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getChoiceMode()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_0

    .line 57
    .line 58
    invoke-virtual {v1, p2, v3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 59
    .line 60
    .line 61
    :cond_0
    if-eqz v0, :cond_1

    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    new-instance p2, Lj/e;

    .line 71
    .line 72
    const/4 v0, 0x3

    .line 73
    invoke-direct {p2, p0, v0}, Lj/e;-><init>(Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 77
    .line 78
    .line 79
    new-instance p1, Landroidx/appcompat/widget/s0;

    .line 80
    .line 81
    invoke-direct {p1, p0, p2}, Landroidx/appcompat/widget/s0;-><init>(Landroidx/appcompat/widget/t0;Lj/e;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
.end method

.method public final p()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/t0;->U:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q(Landroid/widget/ListAdapter;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/o2;->q(Landroid/widget/ListAdapter;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/t0;->V:Landroid/widget/ListAdapter;

    .line 5
    .line 6
    return-void
.end method

.method public final s()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/o2;->e()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/appcompat/widget/t0;->Y:Landroidx/appcompat/widget/w0;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v2, v1, Landroidx/appcompat/widget/w0;->y:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Landroidx/appcompat/widget/n4;->a(Landroid/view/View;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v1, Landroidx/appcompat/widget/w0;->y:Landroid/graphics/Rect;

    .line 21
    .line 22
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, v1, Landroidx/appcompat/widget/w0;->y:Landroid/graphics/Rect;

    .line 26
    .line 27
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    neg-int v0, v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, v1, Landroidx/appcompat/widget/w0;->y:Landroid/graphics/Rect;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    iput v2, v0, Landroid/graphics/Rect;->left:I

    .line 37
    .line 38
    move v0, v2

    .line 39
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    iget v5, v1, Landroidx/appcompat/widget/w0;->x:I

    .line 52
    .line 53
    const/4 v6, -0x2

    .line 54
    if-ne v5, v6, :cond_3

    .line 55
    .line 56
    iget-object v5, p0, Landroidx/appcompat/widget/t0;->V:Landroid/widget/ListAdapter;

    .line 57
    .line 58
    check-cast v5, Landroid/widget/SpinnerAdapter;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/appcompat/widget/o2;->e()Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v1, v5, v6}, Landroidx/appcompat/widget/w0;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    iget v6, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 81
    .line 82
    iget-object v7, v1, Landroidx/appcompat/widget/w0;->y:Landroid/graphics/Rect;

    .line 83
    .line 84
    iget v8, v7, Landroid/graphics/Rect;->left:I

    .line 85
    .line 86
    sub-int/2addr v6, v8

    .line 87
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 88
    .line 89
    sub-int/2addr v6, v7

    .line 90
    if-le v5, v6, :cond_2

    .line 91
    .line 92
    move v5, v6

    .line 93
    :cond_2
    sub-int v6, v4, v2

    .line 94
    .line 95
    sub-int/2addr v6, v3

    .line 96
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/o2;->r(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    const/4 v6, -0x1

    .line 105
    if-ne v5, v6, :cond_4

    .line 106
    .line 107
    sub-int v5, v4, v2

    .line 108
    .line 109
    sub-int/2addr v5, v3

    .line 110
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/o2;->r(I)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/o2;->r(I)V

    .line 115
    .line 116
    .line 117
    :goto_1
    invoke-static {v1}, Landroidx/appcompat/widget/n4;->a(Landroid/view/View;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    sub-int/2addr v4, v3

    .line 124
    iget v1, p0, Landroidx/appcompat/widget/o2;->e:I

    .line 125
    .line 126
    sub-int/2addr v4, v1

    .line 127
    iget v1, p0, Landroidx/appcompat/widget/t0;->X:I

    .line 128
    .line 129
    sub-int/2addr v4, v1

    .line 130
    add-int/2addr v4, v0

    .line 131
    goto :goto_2

    .line 132
    :cond_5
    iget v1, p0, Landroidx/appcompat/widget/t0;->X:I

    .line 133
    .line 134
    add-int/2addr v2, v1

    .line 135
    add-int v4, v2, v0

    .line 136
    .line 137
    :goto_2
    iput v4, p0, Landroidx/appcompat/widget/o2;->f:I

    .line 138
    .line 139
    return-void
.end method
