// Generated by data binding compiler. Do not edit!
package com.example.agriconnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.agriconnect.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNewTechniquesDiscriptionsBinding extends ViewDataBinding {
  @NonNull
  public final TextView ImplementationInDetails;

  @NonNull
  public final TextView ListOfBenfits;

  @NonNull
  public final TextView NewTechniqueDescription;

  @NonNull
  public final ImageView NewTechniqueDescriptionImage;

  @NonNull
  public final TextView NewTechniqueDetails;

  @NonNull
  public final TextView NewTechniqueName;

  @NonNull
  public final TextView RequiredEquipments;

  @NonNull
  public final ScrollView scrollViewNewTechniques;

  protected FragmentNewTechniquesDiscriptionsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView ImplementationInDetails, TextView ListOfBenfits,
      TextView NewTechniqueDescription, ImageView NewTechniqueDescriptionImage,
      TextView NewTechniqueDetails, TextView NewTechniqueName, TextView RequiredEquipments,
      ScrollView scrollViewNewTechniques) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ImplementationInDetails = ImplementationInDetails;
    this.ListOfBenfits = ListOfBenfits;
    this.NewTechniqueDescription = NewTechniqueDescription;
    this.NewTechniqueDescriptionImage = NewTechniqueDescriptionImage;
    this.NewTechniqueDetails = NewTechniqueDetails;
    this.NewTechniqueName = NewTechniqueName;
    this.RequiredEquipments = RequiredEquipments;
    this.scrollViewNewTechniques = scrollViewNewTechniques;
  }

  @NonNull
  public static FragmentNewTechniquesDiscriptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_new__techniques__discriptions, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNewTechniquesDiscriptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNewTechniquesDiscriptionsBinding>inflateInternal(inflater, R.layout.fragment_new__techniques__discriptions, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNewTechniquesDiscriptionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_new__techniques__discriptions, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNewTechniquesDiscriptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNewTechniquesDiscriptionsBinding>inflateInternal(inflater, R.layout.fragment_new__techniques__discriptions, null, false, component);
  }

  public static FragmentNewTechniquesDiscriptionsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentNewTechniquesDiscriptionsBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentNewTechniquesDiscriptionsBinding)bind(component, view, R.layout.fragment_new__techniques__discriptions);
  }
}
