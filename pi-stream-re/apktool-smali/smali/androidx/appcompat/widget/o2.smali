.class public Landroidx/appcompat/widget/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/g0;


# static fields
.field public static final R:Ljava/lang/reflect/Method;

.field public static final S:Ljava/lang/reflect/Method;

.field public static final T:Ljava/lang/reflect/Method;


# instance fields
.field public A:Z

.field public B:Z

.field public C:I

.field public final D:I

.field public E:Landroidx/appcompat/widget/l2;

.field public F:Landroid/view/View;

.field public G:Landroid/widget/AdapterView$OnItemClickListener;

.field public H:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public final I:Landroidx/appcompat/widget/h2;

.field public final J:Landroidx/appcompat/widget/n2;

.field public final K:Landroidx/appcompat/widget/m2;

.field public final L:Landroidx/appcompat/widget/h2;

.field public final M:Landroid/os/Handler;

.field public final N:Landroid/graphics/Rect;

.field public O:Landroid/graphics/Rect;

.field public P:Z

.field public final Q:Landroidx/appcompat/widget/g0;

.field public final a:Landroid/content/Context;

.field public b:Landroid/widget/ListAdapter;

.field public c:Landroidx/appcompat/widget/b2;

.field public final d:I

.field public e:I

.field public f:I

.field public x:I

.field public final y:I

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "ListPopupWindow"

    .line 8
    .line 9
    const-class v5, Landroid/widget/PopupWindow;

    .line 10
    .line 11
    if-gt v0, v1, :cond_0

    .line 12
    .line 13
    :try_start_0
    const-string v0, "setClipToScreenEnabled"

    .line 14
    .line 15
    new-array v1, v3, [Ljava/lang/Class;

    .line 16
    .line 17
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    aput-object v6, v1, v2

    .line 20
    .line 21
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Landroidx/appcompat/widget/o2;->R:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    const-string v0, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 29
    .line 30
    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :goto_0
    :try_start_1
    const-string v0, "setEpicenterBounds"

    .line 34
    .line 35
    new-array v1, v3, [Ljava/lang/Class;

    .line 36
    .line 37
    const-class v6, Landroid/graphics/Rect;

    .line 38
    .line 39
    aput-object v6, v1, v2

    .line 40
    .line 41
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Landroidx/appcompat/widget/o2;->T:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catch_1
    const-string v0, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."

    .line 49
    .line 50
    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_0
    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v1, 0x17

    .line 56
    .line 57
    if-gt v0, v1, :cond_1

    .line 58
    .line 59
    :try_start_2
    const-string v0, "getMaxAvailableHeight"

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    new-array v1, v1, [Ljava/lang/Class;

    .line 63
    .line 64
    const-class v6, Landroid/view/View;

    .line 65
    .line 66
    aput-object v6, v1, v2

    .line 67
    .line 68
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    aput-object v2, v1, v3

    .line 71
    .line 72
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    const/4 v3, 0x2

    .line 75
    aput-object v2, v1, v3

    .line 76
    .line 77
    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Landroidx/appcompat/widget/o2;->S:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catch_2
    const-string v0, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."

    .line 85
    .line 86
    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_2
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    iput v0, p0, Landroidx/appcompat/widget/o2;->d:I

    .line 6
    .line 7
    iput v0, p0, Landroidx/appcompat/widget/o2;->e:I

    .line 8
    .line 9
    const/16 v0, 0x3ea

    .line 10
    .line 11
    iput v0, p0, Landroidx/appcompat/widget/o2;->y:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Landroidx/appcompat/widget/o2;->C:I

    .line 15
    .line 16
    const v1, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v1, p0, Landroidx/appcompat/widget/o2;->D:I

    .line 20
    .line 21
    new-instance v1, Landroidx/appcompat/widget/h2;

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-direct {v1, p0, v2}, Landroidx/appcompat/widget/h2;-><init>(Landroidx/appcompat/widget/o2;I)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Landroidx/appcompat/widget/o2;->I:Landroidx/appcompat/widget/h2;

    .line 28
    .line 29
    new-instance v1, Landroidx/appcompat/widget/n2;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Landroidx/appcompat/widget/n2;-><init>(Landroidx/appcompat/widget/o2;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Landroidx/appcompat/widget/o2;->J:Landroidx/appcompat/widget/n2;

    .line 35
    .line 36
    new-instance v1, Landroidx/appcompat/widget/m2;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Landroidx/appcompat/widget/m2;-><init>(Landroidx/appcompat/widget/o2;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Landroidx/appcompat/widget/o2;->K:Landroidx/appcompat/widget/m2;

    .line 42
    .line 43
    new-instance v1, Landroidx/appcompat/widget/h2;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-direct {v1, p0, v2}, Landroidx/appcompat/widget/h2;-><init>(Landroidx/appcompat/widget/o2;I)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Landroidx/appcompat/widget/o2;->L:Landroidx/appcompat/widget/h2;

    .line 50
    .line 51
    new-instance v1, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Landroidx/appcompat/widget/o2;->N:Landroid/graphics/Rect;

    .line 57
    .line 58
    iput-object p1, p0, Landroidx/appcompat/widget/o2;->a:Landroid/content/Context;

    .line 59
    .line 60
    new-instance v1, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Landroidx/appcompat/widget/o2;->M:Landroid/os/Handler;

    .line 70
    .line 71
    sget-object v1, Le/a;->o:[I

    .line 72
    .line 73
    invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    iput v3, p0, Landroidx/appcompat/widget/o2;->f:I

    .line 82
    .line 83
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Landroidx/appcompat/widget/o2;->x:I

    .line 88
    .line 89
    if-eqz v0, :cond_0

    .line 90
    .line 91
    iput-boolean v2, p0, Landroidx/appcompat/widget/o2;->z:Z

    .line 92
    .line 93
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 94
    .line 95
    .line 96
    new-instance v0, Landroidx/appcompat/widget/g0;

    .line 97
    .line 98
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/appcompat/widget/g0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Landroidx/appcompat/widget/o2;->Q:Landroidx/appcompat/widget/g0;

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Z)Landroidx/appcompat/widget/b2;
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/widget/b2;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/appcompat/widget/b2;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->Q:Landroidx/appcompat/widget/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/o2;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()V
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/o2;->Q:Landroidx/appcompat/widget/g0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Landroidx/appcompat/widget/o2;->a:Landroid/content/Context;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Landroidx/appcompat/widget/o2;->P:Z

    .line 12
    .line 13
    xor-int/2addr v0, v2

    .line 14
    invoke-virtual {p0, v4, v0}, Landroidx/appcompat/widget/o2;->a(Landroid/content/Context;Z)Landroidx/appcompat/widget/b2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 19
    .line 20
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->b:Landroid/widget/ListAdapter;

    .line 21
    .line 22
    invoke-virtual {v0, v5}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 26
    .line 27
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->G:Landroid/widget/AdapterView$OnItemClickListener;

    .line 28
    .line 29
    invoke-virtual {v0, v5}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 43
    .line 44
    new-instance v5, Landroidx/appcompat/widget/i2;

    .line 45
    .line 46
    invoke-direct {v5, p0, v3}, Landroidx/appcompat/widget/i2;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v5}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 53
    .line 54
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->K:Landroidx/appcompat/widget/m2;

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->H:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Landroid/view/ViewGroup;

    .line 79
    .line 80
    :goto_0
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->N:Landroid/graphics/Rect;

    .line 85
    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 89
    .line 90
    .line 91
    iget v0, v5, Landroid/graphics/Rect;->top:I

    .line 92
    .line 93
    iget v6, v5, Landroid/graphics/Rect;->bottom:I

    .line 94
    .line 95
    add-int/2addr v6, v0

    .line 96
    iget-boolean v7, p0, Landroidx/appcompat/widget/o2;->z:Z

    .line 97
    .line 98
    if-nez v7, :cond_3

    .line 99
    .line 100
    neg-int v0, v0

    .line 101
    iput v0, p0, Landroidx/appcompat/widget/o2;->x:I

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V

    .line 105
    .line 106
    .line 107
    move v6, v3

    .line 108
    :cond_3
    :goto_1
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/4 v7, 0x2

    .line 113
    if-ne v0, v7, :cond_4

    .line 114
    .line 115
    move v0, v2

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move v0, v3

    .line 118
    :goto_2
    iget-object v8, p0, Landroidx/appcompat/widget/o2;->F:Landroid/view/View;

    .line 119
    .line 120
    iget v9, p0, Landroidx/appcompat/widget/o2;->x:I

    .line 121
    .line 122
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 123
    .line 124
    const/16 v11, 0x17

    .line 125
    .line 126
    const-string v12, "ListPopupWindow"

    .line 127
    .line 128
    if-gt v10, v11, :cond_6

    .line 129
    .line 130
    sget-object v10, Landroidx/appcompat/widget/o2;->S:Ljava/lang/reflect/Method;

    .line 131
    .line 132
    if-eqz v10, :cond_5

    .line 133
    .line 134
    const/4 v11, 0x3

    .line 135
    :try_start_0
    new-array v11, v11, [Ljava/lang/Object;

    .line 136
    .line 137
    aput-object v8, v11, v3

    .line 138
    .line 139
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    aput-object v13, v11, v2

    .line 144
    .line 145
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    aput-object v0, v11, v7

    .line 150
    .line 151
    invoke-virtual {v10, v1, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    goto :goto_3

    .line 162
    :catch_0
    const-string v0, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."

    .line 163
    .line 164
    invoke-static {v12, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    :cond_5
    invoke-virtual {v1, v8, v9}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    goto :goto_3

    .line 172
    :cond_6
    invoke-static {v1, v8, v9, v0}, Landroidx/appcompat/widget/j2;->a(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    :goto_3
    iget v8, p0, Landroidx/appcompat/widget/o2;->d:I

    .line 177
    .line 178
    const/4 v9, -0x2

    .line 179
    const/4 v10, -0x1

    .line 180
    if-ne v8, v10, :cond_7

    .line 181
    .line 182
    add-int/2addr v0, v6

    .line 183
    goto :goto_6

    .line 184
    :cond_7
    iget v11, p0, Landroidx/appcompat/widget/o2;->e:I

    .line 185
    .line 186
    if-eq v11, v9, :cond_9

    .line 187
    .line 188
    const/high16 v13, 0x40000000    # 2.0f

    .line 189
    .line 190
    if-eq v11, v10, :cond_8

    .line 191
    .line 192
    invoke-static {v11, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    goto :goto_4

    .line 197
    :cond_8
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 206
    .line 207
    iget v11, v5, Landroid/graphics/Rect;->left:I

    .line 208
    .line 209
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 210
    .line 211
    add-int/2addr v11, v5

    .line 212
    sub-int/2addr v4, v11

    .line 213
    invoke-static {v4, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    goto :goto_4

    .line 218
    :cond_9
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 227
    .line 228
    iget v11, v5, Landroid/graphics/Rect;->left:I

    .line 229
    .line 230
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 231
    .line 232
    add-int/2addr v11, v5

    .line 233
    sub-int/2addr v4, v11

    .line 234
    const/high16 v5, -0x80000000

    .line 235
    .line 236
    invoke-static {v4, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    :goto_4
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 241
    .line 242
    add-int/2addr v0, v3

    .line 243
    invoke-virtual {v5, v4, v0}, Landroidx/appcompat/widget/b2;->a(II)I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-lez v0, :cond_a

    .line 248
    .line 249
    iget-object v4, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 250
    .line 251
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 256
    .line 257
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    add-int/2addr v5, v4

    .line 262
    add-int/2addr v5, v6

    .line 263
    add-int/2addr v5, v3

    .line 264
    goto :goto_5

    .line 265
    :cond_a
    move v5, v3

    .line 266
    :goto_5
    add-int/2addr v0, v5

    .line 267
    :goto_6
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-ne v4, v7, :cond_b

    .line 272
    .line 273
    move v4, v2

    .line 274
    goto :goto_7

    .line 275
    :cond_b
    move v4, v3

    .line 276
    :goto_7
    iget v5, p0, Landroidx/appcompat/widget/o2;->y:I

    .line 277
    .line 278
    invoke-static {v1, v5}, Lk0/n;->d(Landroid/widget/PopupWindow;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-eqz v5, :cond_17

    .line 286
    .line 287
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->F:Landroid/view/View;

    .line 288
    .line 289
    sget-object v6, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 290
    .line 291
    invoke-static {v5}, Lg0/k0;->b(Landroid/view/View;)Z

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    if-nez v5, :cond_c

    .line 296
    .line 297
    return-void

    .line 298
    :cond_c
    iget v5, p0, Landroidx/appcompat/widget/o2;->e:I

    .line 299
    .line 300
    if-ne v5, v10, :cond_d

    .line 301
    .line 302
    move v5, v10

    .line 303
    goto :goto_8

    .line 304
    :cond_d
    if-ne v5, v9, :cond_e

    .line 305
    .line 306
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->F:Landroid/view/View;

    .line 307
    .line 308
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    :cond_e
    :goto_8
    if-ne v8, v10, :cond_13

    .line 313
    .line 314
    if-eqz v4, :cond_f

    .line 315
    .line 316
    move v8, v0

    .line 317
    goto :goto_9

    .line 318
    :cond_f
    move v8, v10

    .line 319
    :goto_9
    if-eqz v4, :cond_11

    .line 320
    .line 321
    iget v0, p0, Landroidx/appcompat/widget/o2;->e:I

    .line 322
    .line 323
    if-ne v0, v10, :cond_10

    .line 324
    .line 325
    move v0, v10

    .line 326
    goto :goto_a

    .line 327
    :cond_10
    move v0, v3

    .line 328
    :goto_a
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 332
    .line 333
    .line 334
    goto :goto_b

    .line 335
    :cond_11
    iget v0, p0, Landroidx/appcompat/widget/o2;->e:I

    .line 336
    .line 337
    if-ne v0, v10, :cond_12

    .line 338
    .line 339
    move v3, v10

    .line 340
    :cond_12
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v10}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 344
    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_13
    if-ne v8, v9, :cond_14

    .line 348
    .line 349
    move v8, v0

    .line 350
    :cond_14
    :goto_b
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 351
    .line 352
    .line 353
    iget-object v2, p0, Landroidx/appcompat/widget/o2;->F:Landroid/view/View;

    .line 354
    .line 355
    iget v3, p0, Landroidx/appcompat/widget/o2;->f:I

    .line 356
    .line 357
    iget v4, p0, Landroidx/appcompat/widget/o2;->x:I

    .line 358
    .line 359
    if-gez v5, :cond_15

    .line 360
    .line 361
    move v5, v10

    .line 362
    :cond_15
    if-gez v8, :cond_16

    .line 363
    .line 364
    move v6, v10

    .line 365
    goto :goto_c

    .line 366
    :cond_16
    move v6, v8

    .line 367
    :goto_c
    invoke-virtual/range {v1 .. v6}, Landroidx/appcompat/widget/g0;->update(Landroid/view/View;IIII)V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_11

    .line 371
    .line 372
    :cond_17
    iget v4, p0, Landroidx/appcompat/widget/o2;->e:I

    .line 373
    .line 374
    if-ne v4, v10, :cond_18

    .line 375
    .line 376
    move v4, v10

    .line 377
    goto :goto_d

    .line 378
    :cond_18
    if-ne v4, v9, :cond_19

    .line 379
    .line 380
    iget-object v4, p0, Landroidx/appcompat/widget/o2;->F:Landroid/view/View;

    .line 381
    .line 382
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    :cond_19
    :goto_d
    if-ne v8, v10, :cond_1a

    .line 387
    .line 388
    move v8, v10

    .line 389
    goto :goto_e

    .line 390
    :cond_1a
    if-ne v8, v9, :cond_1b

    .line 391
    .line 392
    move v8, v0

    .line 393
    :cond_1b
    :goto_e
    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 397
    .line 398
    .line 399
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 400
    .line 401
    const/16 v4, 0x1c

    .line 402
    .line 403
    if-gt v0, v4, :cond_1c

    .line 404
    .line 405
    sget-object v0, Landroidx/appcompat/widget/o2;->R:Ljava/lang/reflect/Method;

    .line 406
    .line 407
    if-eqz v0, :cond_1d

    .line 408
    .line 409
    :try_start_1
    new-array v5, v2, [Ljava/lang/Object;

    .line 410
    .line 411
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 412
    .line 413
    aput-object v6, v5, v3

    .line 414
    .line 415
    invoke-virtual {v0, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 416
    .line 417
    .line 418
    goto :goto_f

    .line 419
    :catch_1
    const-string v0, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 420
    .line 421
    invoke-static {v12, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 422
    .line 423
    .line 424
    goto :goto_f

    .line 425
    :cond_1c
    invoke-static {v1, v2}, Landroidx/appcompat/widget/k2;->b(Landroid/widget/PopupWindow;Z)V

    .line 426
    .line 427
    .line 428
    :cond_1d
    :goto_f
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 429
    .line 430
    .line 431
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->J:Landroidx/appcompat/widget/n2;

    .line 432
    .line 433
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 434
    .line 435
    .line 436
    iget-boolean v0, p0, Landroidx/appcompat/widget/o2;->B:Z

    .line 437
    .line 438
    if-eqz v0, :cond_1e

    .line 439
    .line 440
    iget-boolean v0, p0, Landroidx/appcompat/widget/o2;->A:Z

    .line 441
    .line 442
    invoke-static {v1, v0}, Lk0/n;->c(Landroid/widget/PopupWindow;Z)V

    .line 443
    .line 444
    .line 445
    :cond_1e
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 446
    .line 447
    if-gt v0, v4, :cond_1f

    .line 448
    .line 449
    sget-object v0, Landroidx/appcompat/widget/o2;->T:Ljava/lang/reflect/Method;

    .line 450
    .line 451
    if-eqz v0, :cond_20

    .line 452
    .line 453
    :try_start_2
    new-array v4, v2, [Ljava/lang/Object;

    .line 454
    .line 455
    iget-object v5, p0, Landroidx/appcompat/widget/o2;->O:Landroid/graphics/Rect;

    .line 456
    .line 457
    aput-object v5, v4, v3

    .line 458
    .line 459
    invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 460
    .line 461
    .line 462
    goto :goto_10

    .line 463
    :catch_2
    move-exception v0

    .line 464
    const-string v3, "Could not invoke setEpicenterBounds on PopupWindow"

    .line 465
    .line 466
    invoke-static {v12, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 467
    .line 468
    .line 469
    goto :goto_10

    .line 470
    :cond_1f
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->O:Landroid/graphics/Rect;

    .line 471
    .line 472
    invoke-static {v1, v0}, Landroidx/appcompat/widget/k2;->a(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 473
    .line 474
    .line 475
    :cond_20
    :goto_10
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->F:Landroid/view/View;

    .line 476
    .line 477
    iget v3, p0, Landroidx/appcompat/widget/o2;->f:I

    .line 478
    .line 479
    iget v4, p0, Landroidx/appcompat/widget/o2;->x:I

    .line 480
    .line 481
    iget v5, p0, Landroidx/appcompat/widget/o2;->C:I

    .line 482
    .line 483
    invoke-static {v1, v0, v3, v4, v5}, Lk0/m;->a(Landroid/widget/PopupWindow;Landroid/view/View;III)V

    .line 484
    .line 485
    .line 486
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 487
    .line 488
    invoke-virtual {v0, v10}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 489
    .line 490
    .line 491
    iget-boolean v0, p0, Landroidx/appcompat/widget/o2;->P:Z

    .line 492
    .line 493
    if-eqz v0, :cond_21

    .line 494
    .line 495
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 496
    .line 497
    invoke-virtual {v0}, Landroidx/appcompat/widget/b2;->isInTouchMode()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-eqz v0, :cond_22

    .line 502
    .line 503
    :cond_21
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 504
    .line 505
    if-eqz v0, :cond_22

    .line 506
    .line 507
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/b2;->setListSelectionHidden(Z)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 511
    .line 512
    .line 513
    :cond_22
    iget-boolean v0, p0, Landroidx/appcompat/widget/o2;->P:Z

    .line 514
    .line 515
    if-nez v0, :cond_23

    .line 516
    .line 517
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->M:Landroid/os/Handler;

    .line 518
    .line 519
    iget-object v1, p0, Landroidx/appcompat/widget/o2;->L:Landroidx/appcompat/widget/h2;

    .line 520
    .line 521
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 522
    .line 523
    .line 524
    :cond_23
    :goto_11
    return-void
.end method

.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->Q:Landroidx/appcompat/widget/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->M:Landroid/os/Handler;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/appcompat/widget/o2;->I:Landroidx/appcompat/widget/h2;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->Q:Landroidx/appcompat/widget/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f()Landroid/widget/ListView;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->Q:Landroidx/appcompat/widget/g0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/o2;->x:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Landroidx/appcompat/widget/o2;->z:Z

    .line 5
    .line 6
    return-void
.end method

.method public final l(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/o2;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public final o()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/o2;->z:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Landroidx/appcompat/widget/o2;->x:I

    .line 8
    .line 9
    return v0
.end method

.method public q(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->E:Landroidx/appcompat/widget/l2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/l2;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/l2;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/appcompat/widget/o2;->E:Landroidx/appcompat/widget/l2;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/o2;->b:Landroid/widget/ListAdapter;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/appcompat/widget/o2;->b:Landroid/widget/ListAdapter;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->E:Landroidx/appcompat/widget/l2;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/widget/o2;->c:Landroidx/appcompat/widget/b2;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->b:Landroid/widget/ListAdapter;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    return-void
.end method

.method public final r(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o2;->Q:Landroidx/appcompat/widget/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/appcompat/widget/o2;->N:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    add-int/2addr v0, p1

    .line 20
    iput v0, p0, Landroidx/appcompat/widget/o2;->e:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput p1, p0, Landroidx/appcompat/widget/o2;->e:I

    .line 24
    .line 25
    :goto_0
    return-void
.end method
