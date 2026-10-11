.class public final Lcom/google/android/material/datepicker/n;
.super Landroidx/fragment/app/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/fragment/app/q;"
    }
.end annotation


# instance fields
.field public final C0:Ljava/util/LinkedHashSet;

.field public final D0:Ljava/util/LinkedHashSet;

.field public E0:I

.field public F0:Lcom/google/android/material/datepicker/u;

.field public G0:Lcom/google/android/material/datepicker/c;

.field public H0:Lcom/google/android/material/datepicker/k;

.field public I0:I

.field public J0:Ljava/lang/CharSequence;

.field public K0:Z

.field public L0:I

.field public M0:I

.field public N0:Ljava/lang/CharSequence;

.field public O0:I

.field public P0:Ljava/lang/CharSequence;

.field public Q0:Landroid/widget/TextView;

.field public R0:Lcom/google/android/material/internal/CheckableImageButton;

.field public S0:Lj6/g;

.field public T0:Landroid/widget/Button;

.field public U0:Z

.field public V0:Ljava/lang/CharSequence;

.field public W0:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/q;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/android/material/datepicker/n;->C0:Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/google/android/material/datepicker/n;->D0:Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    return-void
.end method

.method public static Y(Landroid/content/Context;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f070280

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {}, Lcom/google/android/material/datepicker/w;->c()Ljava/util/Calendar;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x5

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lcom/google/android/material/datepicker/w;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x7

    .line 33
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->getMaximum(I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 41
    .line 42
    .line 43
    const v1, 0x7f070286

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const v2, 0x7f070294

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    mul-int/2addr v0, v4

    .line 58
    mul-int/2addr v1, v5

    .line 59
    add-int/2addr v1, v0

    .line 60
    sub-int/2addr v5, v3

    .line 61
    mul-int/2addr v5, p0

    .line 62
    add-int/2addr v5, v1

    .line 63
    return v5
.end method

.method public static Z(Landroid/content/Context;)Z
    .locals 1

    .line 1
    const v0, 0x101020d

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lcom/google/android/material/datepicker/n;->a0(Landroid/content/Context;I)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public static a0(Landroid/content/Context;I)Z
    .locals 2

    .line 1
    const-class v0, Lcom/google/android/material/datepicker/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f0402d5

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0, v1}, Lq6/g;->e0(Landroid/content/Context;Ljava/lang/String;I)Landroid/util/TypedValue;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 15
    .line 16
    filled-new-array {p1}, [I

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    .line 31
    .line 32
    return p1
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/q;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 5
    .line 6
    iget v1, p0, Lcom/google/android/material/datepicker/n;->E0:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "DATE_SELECTOR_KEY"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/google/android/material/datepicker/a;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/google/android/material/datepicker/n;->G0:Lcom/google/android/material/datepicker/c;

    .line 20
    .line 21
    invoke-direct {v0, v2}, Lcom/google/android/material/datepicker/a;-><init>(Lcom/google/android/material/datepicker/c;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lcom/google/android/material/datepicker/n;->H0:Lcom/google/android/material/datepicker/k;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    move-object v2, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v2, v2, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 31
    .line 32
    :goto_0
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-wide v2, v2, Lcom/google/android/material/datepicker/p;->f:J

    .line 35
    .line 36
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, v0, Lcom/google/android/material/datepicker/a;->c:Ljava/lang/Long;

    .line 41
    .line 42
    :cond_1
    new-instance v2, Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v3, v0, Lcom/google/android/material/datepicker/a;->e:Lcom/google/android/material/datepicker/b;

    .line 48
    .line 49
    const-string v4, "DEEP_COPY_VALIDATOR_KEY"

    .line 50
    .line 51
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Lcom/google/android/material/datepicker/c;

    .line 55
    .line 56
    iget-wide v5, v0, Lcom/google/android/material/datepicker/a;->a:J

    .line 57
    .line 58
    invoke-static {v5, v6}, Lcom/google/android/material/datepicker/p;->e(J)Lcom/google/android/material/datepicker/p;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    iget-wide v7, v0, Lcom/google/android/material/datepicker/a;->b:J

    .line 63
    .line 64
    invoke-static {v7, v8}, Lcom/google/android/material/datepicker/p;->e(J)Lcom/google/android/material/datepicker/p;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    move-object v8, v2

    .line 73
    check-cast v8, Lcom/google/android/material/datepicker/b;

    .line 74
    .line 75
    iget-object v2, v0, Lcom/google/android/material/datepicker/a;->c:Ljava/lang/Long;

    .line 76
    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    move-object v9, v1

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    invoke-static {v4, v5}, Lcom/google/android/material/datepicker/p;->e(J)Lcom/google/android/material/datepicker/p;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object v9, v2

    .line 90
    :goto_1
    iget v10, v0, Lcom/google/android/material/datepicker/a;->d:I

    .line 91
    .line 92
    move-object v5, v3

    .line 93
    invoke-direct/range {v5 .. v10}, Lcom/google/android/material/datepicker/c;-><init>(Lcom/google/android/material/datepicker/p;Lcom/google/android/material/datepicker/p;Lcom/google/android/material/datepicker/b;Lcom/google/android/material/datepicker/p;I)V

    .line 94
    .line 95
    .line 96
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 97
    .line 98
    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 99
    .line 100
    .line 101
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 102
    .line 103
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 104
    .line 105
    .line 106
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 107
    .line 108
    iget v1, p0, Lcom/google/android/material/datepicker/n;->I0:I

    .line 109
    .line 110
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    const-string v0, "TITLE_TEXT_KEY"

    .line 114
    .line 115
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->J0:Ljava/lang/CharSequence;

    .line 116
    .line 117
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 121
    .line 122
    iget v1, p0, Lcom/google/android/material/datepicker/n;->M0:I

    .line 123
    .line 124
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 125
    .line 126
    .line 127
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 128
    .line 129
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->N0:Ljava/lang/CharSequence;

    .line 130
    .line 131
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 135
    .line 136
    iget v1, p0, Lcom/google/android/material/datepicker/n;->O0:I

    .line 137
    .line 138
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 142
    .line 143
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->P0:Ljava/lang/CharSequence;

    .line 144
    .line 145
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final G()V
    .locals 12

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/q;->G()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/q;->W()Landroid/app/Dialog;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-boolean v1, p0, Lcom/google/android/material/datepicker/n;->K0:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v1, :cond_e

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->S0:Lj6/g;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, Lcom/google/android/material/datepicker/n;->U0:Z

    .line 29
    .line 30
    if-nez v1, :cond_f

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/y;->P()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const v5, 0x7f0a00ed

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    instance-of v5, v5, Landroid/graphics/drawable/ColorDrawable;

    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Landroid/graphics/drawable/ColorDrawable;

    .line 56
    .line 57
    invoke-virtual {v5}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move-object v5, v4

    .line 67
    :goto_0
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-nez v7, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move v7, v3

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    :goto_1
    move v7, v2

    .line 81
    :goto_2
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    const v9, 0x1010031

    .line 86
    .line 87
    .line 88
    const/high16 v10, -0x1000000

    .line 89
    .line 90
    invoke-static {v8, v9, v10}, Lq6/g;->A(Landroid/content/Context;II)I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    :cond_3
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    const/16 v8, 0x1e

    .line 105
    .line 106
    if-lt v6, v8, :cond_4

    .line 107
    .line 108
    invoke-static {v0, v3}, Lg0/p1;->a(Landroid/view/Window;Z)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    invoke-static {v0, v3}, Lg0/o1;->a(Landroid/view/Window;Z)V

    .line 113
    .line 114
    .line 115
    :goto_3
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    const/16 v11, 0x1b

    .line 123
    .line 124
    if-ge v6, v11, :cond_5

    .line 125
    .line 126
    const v6, 0x1010452

    .line 127
    .line 128
    .line 129
    invoke-static {v9, v6, v10}, Lq6/g;->A(Landroid/content/Context;II)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    const/16 v9, 0x80

    .line 134
    .line 135
    invoke-static {v6, v9}, Lz/a;->c(II)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    goto :goto_4

    .line 140
    :cond_5
    move v6, v3

    .line 141
    :goto_4
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v6}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-static {v5}, Lq6/g;->E(I)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    invoke-static {v3}, Lq6/g;->E(I)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-nez v9, :cond_7

    .line 160
    .line 161
    if-eqz v5, :cond_6

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_6
    move v5, v3

    .line 165
    goto :goto_6

    .line 166
    :cond_7
    :goto_5
    move v5, v2

    .line 167
    :goto_6
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 168
    .line 169
    .line 170
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 171
    .line 172
    const/16 v10, 0x1a

    .line 173
    .line 174
    if-lt v9, v8, :cond_8

    .line 175
    .line 176
    new-instance v9, Lg0/p2;

    .line 177
    .line 178
    invoke-direct {v9, v0}, Lg0/p2;-><init>(Landroid/view/Window;)V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_8
    if-lt v9, v10, :cond_9

    .line 183
    .line 184
    new-instance v9, Lg0/n2;

    .line 185
    .line 186
    invoke-direct {v9, v0}, Lg0/n2;-><init>(Landroid/view/Window;)V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_9
    new-instance v9, Lg0/m2;

    .line 191
    .line 192
    invoke-direct {v9, v0}, Lg0/m2;-><init>(Landroid/view/Window;)V

    .line 193
    .line 194
    .line 195
    :goto_7
    invoke-virtual {v9, v5}, Lj6/e;->y(Z)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    invoke-static {v5}, Lq6/g;->E(I)Z

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    invoke-static {v6}, Lq6/g;->E(I)Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-nez v7, :cond_b

    .line 211
    .line 212
    if-nez v6, :cond_a

    .line 213
    .line 214
    if-eqz v5, :cond_a

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_a
    move v5, v3

    .line 218
    goto :goto_9

    .line 219
    :cond_b
    :goto_8
    move v5, v2

    .line 220
    :goto_9
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 221
    .line 222
    .line 223
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 224
    .line 225
    if-lt v6, v8, :cond_c

    .line 226
    .line 227
    new-instance v6, Lg0/p2;

    .line 228
    .line 229
    invoke-direct {v6, v0}, Lg0/p2;-><init>(Landroid/view/Window;)V

    .line 230
    .line 231
    .line 232
    goto :goto_a

    .line 233
    :cond_c
    if-lt v6, v10, :cond_d

    .line 234
    .line 235
    new-instance v6, Lg0/n2;

    .line 236
    .line 237
    invoke-direct {v6, v0}, Lg0/n2;-><init>(Landroid/view/Window;)V

    .line 238
    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_d
    new-instance v6, Lg0/m2;

    .line 242
    .line 243
    invoke-direct {v6, v0}, Lg0/m2;-><init>(Landroid/view/Window;)V

    .line 244
    .line 245
    .line 246
    :goto_a
    invoke-virtual {v6, v5}, Lj6/e;->x(Z)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 258
    .line 259
    new-instance v6, Lc/j;

    .line 260
    .line 261
    invoke-direct {v6, p0, v5, v1, v0}, Lc/j;-><init>(Lcom/google/android/material/datepicker/n;ILandroid/view/View;I)V

    .line 262
    .line 263
    .line 264
    sget-object v0, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 265
    .line 266
    invoke-static {v1, v6}, Lg0/n0;->u(Landroid/view/View;Lg0/y;)V

    .line 267
    .line 268
    .line 269
    iput-boolean v2, p0, Lcom/google/android/material/datepicker/n;->U0:Z

    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_e
    const/4 v1, -0x2

    .line 273
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    const v5, 0x7f070288

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    new-instance v1, Landroid/graphics/Rect;

    .line 292
    .line 293
    invoke-direct {v1, v11, v11, v11, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 294
    .line 295
    .line 296
    new-instance v5, Landroid/graphics/drawable/InsetDrawable;

    .line 297
    .line 298
    iget-object v7, p0, Lcom/google/android/material/datepicker/n;->S0:Lj6/g;

    .line 299
    .line 300
    move-object v6, v5

    .line 301
    move v8, v11

    .line 302
    move v9, v11

    .line 303
    move v10, v11

    .line 304
    invoke-direct/range {v6 .. v11}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v5}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    new-instance v5, Lb6/a;

    .line 315
    .line 316
    invoke-virtual {p0}, Landroidx/fragment/app/q;->W()Landroid/app/Dialog;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    invoke-direct {v5, v6, v1}, Lb6/a;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 324
    .line 325
    .line 326
    :cond_f
    :goto_b
    invoke-virtual {p0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 327
    .line 328
    .line 329
    iget v0, p0, Lcom/google/android/material/datepicker/n;->E0:I

    .line 330
    .line 331
    if-eqz v0, :cond_13

    .line 332
    .line 333
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/n;->X()V

    .line 334
    .line 335
    .line 336
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->G0:Lcom/google/android/material/datepicker/c;

    .line 337
    .line 338
    new-instance v5, Lcom/google/android/material/datepicker/k;

    .line 339
    .line 340
    invoke-direct {v5}, Lcom/google/android/material/datepicker/k;-><init>()V

    .line 341
    .line 342
    .line 343
    new-instance v6, Landroid/os/Bundle;

    .line 344
    .line 345
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 346
    .line 347
    .line 348
    const-string v7, "THEME_RES_ID_KEY"

    .line 349
    .line 350
    invoke-virtual {v6, v7, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 351
    .line 352
    .line 353
    const-string v8, "GRID_SELECTOR_KEY"

    .line 354
    .line 355
    invoke-virtual {v6, v8, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 356
    .line 357
    .line 358
    const-string v8, "CALENDAR_CONSTRAINTS_KEY"

    .line 359
    .line 360
    invoke-virtual {v6, v8, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 361
    .line 362
    .line 363
    const-string v9, "DAY_VIEW_DECORATOR_KEY"

    .line 364
    .line 365
    invoke-virtual {v6, v9, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 366
    .line 367
    .line 368
    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->d:Lcom/google/android/material/datepicker/p;

    .line 369
    .line 370
    const-string v9, "CURRENT_MONTH_KEY"

    .line 371
    .line 372
    invoke-virtual {v6, v9, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v5, v6}, Landroidx/fragment/app/y;->S(Landroid/os/Bundle;)V

    .line 376
    .line 377
    .line 378
    iput-object v5, p0, Lcom/google/android/material/datepicker/n;->H0:Lcom/google/android/material/datepicker/k;

    .line 379
    .line 380
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->R0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 381
    .line 382
    invoke-virtual {v1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-eqz v1, :cond_10

    .line 387
    .line 388
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/n;->X()V

    .line 389
    .line 390
    .line 391
    iget-object v5, p0, Lcom/google/android/material/datepicker/n;->G0:Lcom/google/android/material/datepicker/c;

    .line 392
    .line 393
    new-instance v6, Lcom/google/android/material/datepicker/o;

    .line 394
    .line 395
    invoke-direct {v6}, Lcom/google/android/material/datepicker/o;-><init>()V

    .line 396
    .line 397
    .line 398
    new-instance v9, Landroid/os/Bundle;

    .line 399
    .line 400
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v9, v7, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 404
    .line 405
    .line 406
    const-string v0, "DATE_SELECTOR_KEY"

    .line 407
    .line 408
    invoke-virtual {v9, v0, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v9, v8, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v6, v9}, Landroidx/fragment/app/y;->S(Landroid/os/Bundle;)V

    .line 415
    .line 416
    .line 417
    goto :goto_c

    .line 418
    :cond_10
    iget-object v6, p0, Lcom/google/android/material/datepicker/n;->H0:Lcom/google/android/material/datepicker/k;

    .line 419
    .line 420
    :goto_c
    iput-object v6, p0, Lcom/google/android/material/datepicker/n;->F0:Lcom/google/android/material/datepicker/u;

    .line 421
    .line 422
    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->Q0:Landroid/widget/TextView;

    .line 423
    .line 424
    if-eqz v1, :cond_12

    .line 425
    .line 426
    invoke-virtual {p0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 439
    .line 440
    const/4 v5, 0x2

    .line 441
    if-ne v1, v5, :cond_11

    .line 442
    .line 443
    goto :goto_d

    .line 444
    :cond_11
    move v2, v3

    .line 445
    :goto_d
    if-eqz v2, :cond_12

    .line 446
    .line 447
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->W0:Ljava/lang/CharSequence;

    .line 448
    .line 449
    goto :goto_e

    .line 450
    :cond_12
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->V0:Ljava/lang/CharSequence;

    .line 451
    .line 452
    :goto_e
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/n;->X()V

    .line 456
    .line 457
    .line 458
    invoke-virtual {p0}, Landroidx/fragment/app/y;->k()Landroid/content/Context;

    .line 459
    .line 460
    .line 461
    throw v4

    .line 462
    :cond_13
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/n;->X()V

    .line 463
    .line 464
    .line 465
    throw v4
.end method

.method public final H()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->F0:Lcom/google/android/material/datepicker/u;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/datepicker/u;->m0:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroidx/fragment/app/q;->H()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final V()Landroid/app/Dialog;
    .locals 7

    .line 1
    new-instance v0, Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lcom/google/android/material/datepicker/n;->E0:I

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Lcom/google/android/material/datepicker/n;->Z(Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iput-boolean v2, p0, Lcom/google/android/material/datepicker/n;->K0:Z

    .line 27
    .line 28
    const-class v2, Lcom/google/android/material/datepicker/n;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const v4, 0x7f040114

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2, v4}, Lq6/g;->e0(Landroid/content/Context;Ljava/lang/String;I)Landroid/util/TypedValue;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget v2, v2, Landroid/util/TypedValue;->data:I

    .line 42
    .line 43
    new-instance v4, Lj6/g;

    .line 44
    .line 45
    const v5, 0x7f0402d5

    .line 46
    .line 47
    .line 48
    const v6, 0x7f13042e

    .line 49
    .line 50
    .line 51
    invoke-direct {v4, v1, v3, v5, v6}, Lj6/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 52
    .line 53
    .line 54
    iput-object v4, p0, Lcom/google/android/material/datepicker/n;->S0:Lj6/g;

    .line 55
    .line 56
    invoke-virtual {v4, v1}, Lj6/g;->h(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->S0:Lj6/g;

    .line 60
    .line 61
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, Lj6/g;->j(Landroid/content/res/ColorStateList;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->S0:Lj6/g;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sget-object v3, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 79
    .line 80
    invoke-static {v2}, Lg0/n0;->i(Landroid/view/View;)F

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {v1, v2}, Lj6/g;->i(F)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/n;->X()V

    .line 89
    .line 90
    .line 91
    throw v3
.end method

.method public final X()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/y;->f:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "DATE_SELECTOR_KEY"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La3/g;->y(Landroid/os/Parcelable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->C0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/content/DialogInterface$OnCancelListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->D0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 24
    .line 25
    check-cast v0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onDismiss(Landroid/content/DialogInterface;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final x(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/q;->x(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Landroidx/fragment/app/y;->f:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/google/android/material/datepicker/n;->E0:I

    .line 15
    .line 16
    const-string v0, "DATE_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, La3/g;->y(Landroid/os/Parcelable;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/google/android/material/datepicker/c;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/google/android/material/datepicker/n;->G0:Lcom/google/android/material/datepicker/c;

    .line 34
    .line 35
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, La3/g;->y(Landroid/os/Parcelable;)V

    .line 42
    .line 43
    .line 44
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput v0, p0, Lcom/google/android/material/datepicker/n;->I0:I

    .line 51
    .line 52
    const-string v0, "TITLE_TEXT_KEY"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/google/android/material/datepicker/n;->J0:Ljava/lang/CharSequence;

    .line 59
    .line 60
    const-string v0, "INPUT_MODE_KEY"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iput v0, p0, Lcom/google/android/material/datepicker/n;->L0:I

    .line 67
    .line 68
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput v0, p0, Lcom/google/android/material/datepicker/n;->M0:I

    .line 75
    .line 76
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lcom/google/android/material/datepicker/n;->N0:Ljava/lang/CharSequence;

    .line 83
    .line 84
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iput v0, p0, Lcom/google/android/material/datepicker/n;->O0:I

    .line 91
    .line 92
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->P0:Ljava/lang/CharSequence;

    .line 99
    .line 100
    iget-object p1, p0, Lcom/google/android/material/datepicker/n;->J0:Ljava/lang/CharSequence;

    .line 101
    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget v0, p0, Lcom/google/android/material/datepicker/n;->I0:I

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :goto_0
    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->V0:Ljava/lang/CharSequence;

    .line 120
    .line 121
    if-eqz p1, :cond_2

    .line 122
    .line 123
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "\n"

    .line 128
    .line 129
    invoke-static {v0, v1}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    array-length v1, v0

    .line 134
    const/4 v2, 0x1

    .line 135
    if-le v1, v2, :cond_3

    .line 136
    .line 137
    const/4 p1, 0x0

    .line 138
    aget-object p1, v0, p1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 p1, 0x0

    .line 142
    :cond_3
    :goto_1
    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->W0:Ljava/lang/CharSequence;

    .line 143
    .line 144
    return-void
.end method

.method public final y(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/n;->K0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const v0, 0x7f0d0061

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const v0, 0x7f0d0060

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-virtual {p1, v0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/n;->K0:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const v0, 0x7f0a0140

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 32
    .line 33
    invoke-static {p2}, Lcom/google/android/material/datepicker/n;->Y(Landroid/content/Context;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, -0x2

    .line 38
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const v0, 0x7f0a0141

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 53
    .line 54
    invoke-static {p2}, Lcom/google/android/material/datepicker/n;->Y(Landroid/content/Context;)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v3, -0x1

    .line 59
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    const v0, 0x7f0a014c

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroid/widget/TextView;

    .line 73
    .line 74
    sget-object v1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    invoke-static {v0, v1}, Lg0/k0;->f(Landroid/view/View;I)V

    .line 78
    .line 79
    .line 80
    const v0, 0x7f0a014e

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lcom/google/android/material/internal/CheckableImageButton;

    .line 88
    .line 89
    iput-object v0, p0, Lcom/google/android/material/datepicker/n;->R0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 90
    .line 91
    const v0, 0x7f0a0152

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroid/widget/TextView;

    .line 99
    .line 100
    iput-object v0, p0, Lcom/google/android/material/datepicker/n;->Q0:Landroid/widget/TextView;

    .line 101
    .line 102
    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->R0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 103
    .line 104
    const-string v2, "TOGGLE_BUTTON_TAG"

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->R0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 110
    .line 111
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    .line 112
    .line 113
    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 114
    .line 115
    .line 116
    const v3, 0x10100a0

    .line 117
    .line 118
    .line 119
    filled-new-array {v3}, [I

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    const v4, 0x7f080167

    .line 124
    .line 125
    .line 126
    invoke-static {p2, v4}, Lw7/b;->G(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v2, v3, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 131
    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    new-array v4, v3, [I

    .line 135
    .line 136
    const v5, 0x7f080169

    .line 137
    .line 138
    .line 139
    invoke-static {p2, v5}, Lw7/b;->G(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {v2, v4, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/c0;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 147
    .line 148
    .line 149
    iget-object p2, p0, Lcom/google/android/material/datepicker/n;->R0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 150
    .line 151
    iget v0, p0, Lcom/google/android/material/datepicker/n;->L0:I

    .line 152
    .line 153
    if-eqz v0, :cond_2

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_2
    move v1, v3

    .line 157
    :goto_2
    invoke-virtual {p2, v1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    .line 158
    .line 159
    .line 160
    iget-object p2, p0, Lcom/google/android/material/datepicker/n;->R0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 161
    .line 162
    const/4 v0, 0x0

    .line 163
    invoke-static {p2, v0}, Lg0/y0;->l(Landroid/view/View;Lg0/c;)V

    .line 164
    .line 165
    .line 166
    iget-object p2, p0, Lcom/google/android/material/datepicker/n;->R0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 167
    .line 168
    invoke-virtual {p2}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_3

    .line 173
    .line 174
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    const v1, 0x7f1200d7

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    goto :goto_3

    .line 186
    :cond_3
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    const v1, 0x7f1200d9

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    :goto_3
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->R0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 198
    .line 199
    invoke-virtual {v1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    iget-object p2, p0, Lcom/google/android/material/datepicker/n;->R0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 203
    .line 204
    new-instance v1, Lcom/google/android/material/datepicker/m;

    .line 205
    .line 206
    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/m;-><init>(Lcom/google/android/material/datepicker/n;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    .line 211
    .line 212
    const p2, 0x7f0a0075

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, Landroid/widget/Button;

    .line 220
    .line 221
    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->T0:Landroid/widget/Button;

    .line 222
    .line 223
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/n;->X()V

    .line 224
    .line 225
    .line 226
    throw v0
.end method
