.class public final Lcom/google/android/material/datepicker/k;
.super Lcom/google/android/material/datepicker/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/u;"
    }
.end annotation


# static fields
.field public static final synthetic y0:I


# instance fields
.field public n0:I

.field public o0:Lcom/google/android/material/datepicker/c;

.field public p0:Lcom/google/android/material/datepicker/p;

.field public q0:I

.field public r0:Landroid/support/v4/media/d;

.field public s0:Landroidx/recyclerview/widget/RecyclerView;

.field public t0:Landroidx/recyclerview/widget/RecyclerView;

.field public u0:Landroid/view/View;

.field public v0:Landroid/view/View;

.field public w0:Landroid/view/View;

.field public x0:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/datepicker/u;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "THEME_RES_ID_KEY"

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/datepicker/k;->n0:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "GRID_SELECTOR_KEY"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/material/datepicker/k;->o0:Lcom/google/android/material/datepicker/c;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CURRENT_MONTH_KEY"

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final U(Lcom/google/android/material/datepicker/p;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lm3/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/t;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/material/datepicker/t;->d:Lcom/google/android/material/datepicker/c;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/material/datepicker/c;->a:Lcom/google/android/material/datepicker/p;

    .line 12
    .line 13
    iget-object v1, v0, Lcom/google/android/material/datepicker/p;->a:Ljava/util/Calendar;

    .line 14
    .line 15
    instance-of v2, v1, Ljava/util/GregorianCalendar;

    .line 16
    .line 17
    const-string v3, "Only Gregorian calendars are supported."

    .line 18
    .line 19
    if-eqz v2, :cond_5

    .line 20
    .line 21
    iget v2, p1, Lcom/google/android/material/datepicker/p;->c:I

    .line 22
    .line 23
    iget v4, v0, Lcom/google/android/material/datepicker/p;->c:I

    .line 24
    .line 25
    sub-int/2addr v2, v4

    .line 26
    mul-int/lit8 v2, v2, 0xc

    .line 27
    .line 28
    iget v5, p1, Lcom/google/android/material/datepicker/p;->b:I

    .line 29
    .line 30
    iget v0, v0, Lcom/google/android/material/datepicker/p;->b:I

    .line 31
    .line 32
    sub-int/2addr v5, v0

    .line 33
    add-int/2addr v5, v2

    .line 34
    iget-object v2, p0, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 35
    .line 36
    instance-of v1, v1, Ljava/util/GregorianCalendar;

    .line 37
    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    iget v1, v2, Lcom/google/android/material/datepicker/p;->c:I

    .line 41
    .line 42
    sub-int/2addr v1, v4

    .line 43
    mul-int/lit8 v1, v1, 0xc

    .line 44
    .line 45
    iget v2, v2, Lcom/google/android/material/datepicker/p;->b:I

    .line 46
    .line 47
    sub-int/2addr v2, v0

    .line 48
    add-int/2addr v2, v1

    .line 49
    sub-int v0, v5, v2

    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x3

    .line 56
    const/4 v3, 0x1

    .line 57
    const/4 v4, 0x0

    .line 58
    if-le v1, v2, :cond_0

    .line 59
    .line 60
    move v1, v3

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move v1, v4

    .line 63
    :goto_0
    if-lez v0, :cond_1

    .line 64
    .line 65
    move v4, v3

    .line 66
    :cond_1
    iput-object p1, p0, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 73
    .line 74
    add-int/lit8 v0, v5, -0x3

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->e0(I)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    new-instance v0, Lcom/google/android/gms/common/api/internal/e0;

    .line 82
    .line 83
    invoke-direct {v0, p0, v5, v3}, Lcom/google/android/gms/common/api/internal/e0;-><init>(Ljava/lang/Object;II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    if-eqz v1, :cond_3

    .line 91
    .line 92
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 93
    .line 94
    add-int/lit8 v0, v5, 0x3

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->e0(I)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 100
    .line 101
    new-instance v0, Lcom/google/android/gms/common/api/internal/e0;

    .line 102
    .line 103
    invoke-direct {v0, p0, v5, v3}, Lcom/google/android/gms/common/api/internal/e0;-><init>(Ljava/lang/Object;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 111
    .line 112
    new-instance v0, Lcom/google/android/gms/common/api/internal/e0;

    .line 113
    .line 114
    invoke-direct {v0, p0, v5, v3}, Lcom/google/android/gms/common/api/internal/e0;-><init>(Ljava/lang/Object;II)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 118
    .line 119
    .line 120
    :goto_1
    return-void

    .line 121
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 128
    .line 129
    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p1
.end method

.method public final V(I)V
    .locals 4

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/k;->q0:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lm3/k0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lm3/d0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/google/android/material/datepicker/y;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 24
    .line 25
    iget v3, v3, Lcom/google/android/material/datepicker/p;->c:I

    .line 26
    .line 27
    iget-object v0, v0, Lcom/google/android/material/datepicker/y;->d:Lcom/google/android/material/datepicker/k;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/material/datepicker/k;->o0:Lcom/google/android/material/datepicker/c;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/google/android/material/datepicker/c;->a:Lcom/google/android/material/datepicker/p;

    .line 32
    .line 33
    iget v0, v0, Lcom/google/android/material/datepicker/p;->c:I

    .line 34
    .line 35
    sub-int/2addr v3, v0

    .line 36
    invoke-virtual {p1, v3}, Lm3/k0;->m0(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->w0:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->x0:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->u0:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->v0:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v0, 0x1

    .line 61
    if-ne p1, v0, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->w0:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->x0:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->u0:Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->v0:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/k;->U(Lcom/google/android/material/datepicker/p;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    :goto_0
    return-void
.end method

.method public final x(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/y;->x(Landroid/os/Bundle;)V

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
    const-string v0, "THEME_RES_ID_KEY"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/google/android/material/datepicker/k;->n0:I

    .line 15
    .line 16
    const-string v0, "GRID_SELECTOR_KEY"

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
    iput-object v0, p0, Lcom/google/android/material/datepicker/k;->o0:Lcom/google/android/material/datepicker/c;

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
    const-string v0, "CURRENT_MONTH_KEY"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcom/google/android/material/datepicker/p;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 53
    .line 54
    return-void
.end method

.method public final y(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/y;->k()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lcom/google/android/material/datepicker/k;->n0:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroid/support/v4/media/d;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Landroid/support/v4/media/d;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/google/android/material/datepicker/k;->r0:Landroid/support/v4/media/d;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->o0:Lcom/google/android/material/datepicker/c;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->a:Lcom/google/android/material/datepicker/p;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/google/android/material/datepicker/n;->Z(Landroid/content/Context;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    const v2, 0x7f0d005a

    .line 36
    .line 37
    .line 38
    move v5, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const v2, 0x7f0d0055

    .line 41
    .line 42
    .line 43
    move v5, v4

    .line 44
    :goto_0
    invoke-virtual {p1, v2, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const v2, 0x7f070297

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    const v6, 0x7f070298

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    add-int/2addr v6, v2

    .line 71
    const v2, 0x7f070296

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    add-int/2addr v2, v6

    .line 79
    const v6, 0x7f070287

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    sget v7, Lcom/google/android/material/datepicker/q;->d:I

    .line 87
    .line 88
    const v8, 0x7f070282

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    mul-int/2addr v8, v7

    .line 96
    add-int/lit8 v7, v7, -0x1

    .line 97
    .line 98
    const v9, 0x7f070295

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    mul-int/2addr v9, v7

    .line 106
    add-int/2addr v9, v8

    .line 107
    const v7, 0x7f07027f

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    add-int/2addr v2, v6

    .line 115
    add-int/2addr v2, v9

    .line 116
    add-int/2addr v2, p2

    .line 117
    invoke-virtual {p1, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 118
    .line 119
    .line 120
    const p2, 0x7f0a013f

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    check-cast p2, Landroid/widget/GridView;

    .line 128
    .line 129
    new-instance v2, Lcom/google/android/material/datepicker/g;

    .line 130
    .line 131
    invoke-direct {v2, p0, v4}, Lcom/google/android/material/datepicker/g;-><init>(Lcom/google/android/material/datepicker/k;I)V

    .line 132
    .line 133
    .line 134
    invoke-static {p2, v2}, Lg0/y0;->l(Landroid/view/View;Lg0/c;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, p0, Lcom/google/android/material/datepicker/k;->o0:Lcom/google/android/material/datepicker/c;

    .line 138
    .line 139
    iget v2, v2, Lcom/google/android/material/datepicker/c;->e:I

    .line 140
    .line 141
    new-instance v6, Lcom/google/android/material/datepicker/e;

    .line 142
    .line 143
    if-lez v2, :cond_1

    .line 144
    .line 145
    invoke-direct {v6, v2}, Lcom/google/android/material/datepicker/e;-><init>(I)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_1
    invoke-direct {v6}, Lcom/google/android/material/datepicker/e;-><init>()V

    .line 150
    .line 151
    .line 152
    :goto_1
    invoke-virtual {p2, v6}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 153
    .line 154
    .line 155
    iget v1, v1, Lcom/google/android/material/datepicker/p;->d:I

    .line 156
    .line 157
    invoke-virtual {p2, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 161
    .line 162
    .line 163
    const p2, 0x7f0a0142

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 171
    .line 172
    iput-object p2, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 173
    .line 174
    new-instance p2, Lcom/google/android/material/datepicker/h;

    .line 175
    .line 176
    invoke-virtual {p0}, Landroidx/fragment/app/y;->k()Landroid/content/Context;

    .line 177
    .line 178
    .line 179
    invoke-direct {p2, p0, v5, v5}, Lcom/google/android/material/datepicker/h;-><init>(Lcom/google/android/material/datepicker/k;II)V

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 183
    .line 184
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lm3/k0;)V

    .line 185
    .line 186
    .line 187
    iget-object p2, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    const-string v1, "MONTHS_VIEW_GROUP_TAG"

    .line 190
    .line 191
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    new-instance p2, Lcom/google/android/material/datepicker/t;

    .line 195
    .line 196
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->o0:Lcom/google/android/material/datepicker/c;

    .line 197
    .line 198
    new-instance v2, Lk3/d;

    .line 199
    .line 200
    const/16 v5, 0x16

    .line 201
    .line 202
    invoke-direct {v2, p0, v5}, Lk3/d;-><init>(Ljava/lang/Object;I)V

    .line 203
    .line 204
    .line 205
    invoke-direct {p2, v0, v1, v2}, Lcom/google/android/material/datepicker/t;-><init>(Landroid/view/ContextThemeWrapper;Lcom/google/android/material/datepicker/c;Lk3/d;)V

    .line 206
    .line 207
    .line 208
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 209
    .line 210
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lm3/d0;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const v2, 0x7f0b0034

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    const v2, 0x7f0a0145

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    iput-object v5, p0, Lcom/google/android/material/datepicker/k;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 234
    .line 235
    if-eqz v5, :cond_2

    .line 236
    .line 237
    invoke-virtual {v5, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 238
    .line 239
    .line 240
    iget-object v5, p0, Lcom/google/android/material/datepicker/k;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 241
    .line 242
    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 243
    .line 244
    invoke-direct {v6, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lm3/k0;)V

    .line 248
    .line 249
    .line 250
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 251
    .line 252
    new-instance v5, Lcom/google/android/material/datepicker/y;

    .line 253
    .line 254
    invoke-direct {v5, p0}, Lcom/google/android/material/datepicker/y;-><init>(Lcom/google/android/material/datepicker/k;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lm3/d0;)V

    .line 258
    .line 259
    .line 260
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->s0:Landroidx/recyclerview/widget/RecyclerView;

    .line 261
    .line 262
    new-instance v5, Lcom/google/android/material/datepicker/i;

    .line 263
    .line 264
    invoke-direct {v5, p0}, Lcom/google/android/material/datepicker/i;-><init>(Lcom/google/android/material/datepicker/k;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->i(Lm3/i0;)V

    .line 268
    .line 269
    .line 270
    :cond_2
    const v1, 0x7f0a0138

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    if-eqz v5, :cond_3

    .line 278
    .line 279
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 284
    .line 285
    const-string v5, "SELECTOR_TOGGLE_TAG"

    .line 286
    .line 287
    invoke-virtual {v1, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    new-instance v5, Lcom/google/android/material/datepicker/g;

    .line 291
    .line 292
    const/4 v6, 0x2

    .line 293
    invoke-direct {v5, p0, v6}, Lcom/google/android/material/datepicker/g;-><init>(Lcom/google/android/material/datepicker/k;I)V

    .line 294
    .line 295
    .line 296
    invoke-static {v1, v5}, Lg0/y0;->l(Landroid/view/View;Lg0/c;)V

    .line 297
    .line 298
    .line 299
    const v5, 0x7f0a013a

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    iput-object v5, p0, Lcom/google/android/material/datepicker/k;->u0:Landroid/view/View;

    .line 307
    .line 308
    const-string v6, "NAVIGATION_PREV_TAG"

    .line 309
    .line 310
    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    const v5, 0x7f0a0139

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    iput-object v5, p0, Lcom/google/android/material/datepicker/k;->v0:Landroid/view/View;

    .line 321
    .line 322
    const-string v6, "NAVIGATION_NEXT_TAG"

    .line 323
    .line 324
    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    iput-object v2, p0, Lcom/google/android/material/datepicker/k;->w0:Landroid/view/View;

    .line 332
    .line 333
    const v2, 0x7f0a013e

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    iput-object v2, p0, Lcom/google/android/material/datepicker/k;->x0:Landroid/view/View;

    .line 341
    .line 342
    invoke-virtual {p0, v3}, Lcom/google/android/material/datepicker/k;->V(I)V

    .line 343
    .line 344
    .line 345
    iget-object v2, p0, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 346
    .line 347
    invoke-virtual {v2}, Lcom/google/android/material/datepicker/p;->f()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 352
    .line 353
    .line 354
    iget-object v2, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 355
    .line 356
    new-instance v5, Lcom/google/android/material/datepicker/j;

    .line 357
    .line 358
    invoke-direct {v5, p0, p2, v1}, Lcom/google/android/material/datepicker/j;-><init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/t;Lcom/google/android/material/button/MaterialButton;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->j(Lm3/o0;)V

    .line 362
    .line 363
    .line 364
    new-instance v2, Lf/b;

    .line 365
    .line 366
    const/4 v5, 0x3

    .line 367
    invoke-direct {v2, p0, v5}, Lf/b;-><init>(Ljava/lang/Object;I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 371
    .line 372
    .line 373
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->v0:Landroid/view/View;

    .line 374
    .line 375
    new-instance v2, Lcom/google/android/material/datepicker/f;

    .line 376
    .line 377
    invoke-direct {v2, p0, p2, v3}, Lcom/google/android/material/datepicker/f;-><init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/t;I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 381
    .line 382
    .line 383
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->u0:Landroid/view/View;

    .line 384
    .line 385
    new-instance v2, Lcom/google/android/material/datepicker/f;

    .line 386
    .line 387
    invoke-direct {v2, p0, p2, v4}, Lcom/google/android/material/datepicker/f;-><init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/t;I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 391
    .line 392
    .line 393
    :cond_3
    invoke-static {v0}, Lcom/google/android/material/datepicker/n;->Z(Landroid/content/Context;)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-nez v0, :cond_4

    .line 398
    .line 399
    new-instance v0, Lm3/x;

    .line 400
    .line 401
    invoke-direct {v0, v3}, Lm3/x;-><init>(I)V

    .line 402
    .line 403
    .line 404
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 405
    .line 406
    invoke-virtual {v0, v1}, Lm3/e1;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 407
    .line 408
    .line 409
    :cond_4
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 410
    .line 411
    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 412
    .line 413
    iget-object p2, p2, Lcom/google/android/material/datepicker/t;->d:Lcom/google/android/material/datepicker/c;

    .line 414
    .line 415
    iget-object p2, p2, Lcom/google/android/material/datepicker/c;->a:Lcom/google/android/material/datepicker/p;

    .line 416
    .line 417
    iget-object v2, p2, Lcom/google/android/material/datepicker/p;->a:Ljava/util/Calendar;

    .line 418
    .line 419
    instance-of v2, v2, Ljava/util/GregorianCalendar;

    .line 420
    .line 421
    if-eqz v2, :cond_5

    .line 422
    .line 423
    iget v2, v1, Lcom/google/android/material/datepicker/p;->c:I

    .line 424
    .line 425
    iget v4, p2, Lcom/google/android/material/datepicker/p;->c:I

    .line 426
    .line 427
    sub-int/2addr v2, v4

    .line 428
    mul-int/lit8 v2, v2, 0xc

    .line 429
    .line 430
    iget v1, v1, Lcom/google/android/material/datepicker/p;->b:I

    .line 431
    .line 432
    iget p2, p2, Lcom/google/android/material/datepicker/p;->b:I

    .line 433
    .line 434
    sub-int/2addr v1, p2

    .line 435
    add-int/2addr v1, v2

    .line 436
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->e0(I)V

    .line 437
    .line 438
    .line 439
    iget-object p2, p0, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 440
    .line 441
    new-instance v0, Lcom/google/android/material/datepicker/g;

    .line 442
    .line 443
    invoke-direct {v0, p0, v3}, Lcom/google/android/material/datepicker/g;-><init>(Lcom/google/android/material/datepicker/k;I)V

    .line 444
    .line 445
    .line 446
    invoke-static {p2, v0}, Lg0/y0;->l(Landroid/view/View;Lg0/c;)V

    .line 447
    .line 448
    .line 449
    return-object p1

    .line 450
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 451
    .line 452
    const-string p2, "Only Gregorian calendars are supported."

    .line 453
    .line 454
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw p1
.end method
