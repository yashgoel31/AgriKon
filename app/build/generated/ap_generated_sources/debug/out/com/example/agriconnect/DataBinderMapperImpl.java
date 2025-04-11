package com.example.agriconnect;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.agriconnect.databinding.ActivityFarmerLayoutBindingImpl;
import com.example.agriconnect.databinding.ActivityMainBindingImpl;
import com.example.agriconnect.databinding.ActivitySignInBindingImpl;
import com.example.agriconnect.databinding.ActivitySignUpBindingImpl;
import com.example.agriconnect.databinding.FragmentContactPageBindingImpl;
import com.example.agriconnect.databinding.FragmentCropDetailBindingImpl;
import com.example.agriconnect.databinding.FragmentCropSuggestionBindingImpl;
import com.example.agriconnect.databinding.FragmentFarmerShopBindingImpl;
import com.example.agriconnect.databinding.FragmentGovernmentSchemeDiscriptionBindingImpl;
import com.example.agriconnect.databinding.FragmentGovernmentSchemesBindingImpl;
import com.example.agriconnect.databinding.FragmentHomeBindingImpl;
import com.example.agriconnect.databinding.FragmentMarketPlaceLayoutBindingImpl;
import com.example.agriconnect.databinding.FragmentNewCropsDiscriptionsBindingImpl;
import com.example.agriconnect.databinding.FragmentNewFarmingCropsBindingImpl;
import com.example.agriconnect.databinding.FragmentNewFarmingTeachniquesBindingImpl;
import com.example.agriconnect.databinding.FragmentNewTechniquesDiscriptionsBindingImpl;
import com.example.agriconnect.databinding.FragmentProductDetailsBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYFARMERLAYOUT = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYSIGNIN = 3;

  private static final int LAYOUT_ACTIVITYSIGNUP = 4;

  private static final int LAYOUT_FRAGMENTCONTACTPAGE = 5;

  private static final int LAYOUT_FRAGMENTCROPDETAIL = 6;

  private static final int LAYOUT_FRAGMENTCROPSUGGESTION = 7;

  private static final int LAYOUT_FRAGMENTFARMERSHOP = 8;

  private static final int LAYOUT_FRAGMENTGOVERNMENTSCHEMEDISCRIPTION = 9;

  private static final int LAYOUT_FRAGMENTGOVERNMENTSCHEMES = 10;

  private static final int LAYOUT_FRAGMENTHOME = 11;

  private static final int LAYOUT_FRAGMENTMARKETPLACELAYOUT = 12;

  private static final int LAYOUT_FRAGMENTNEWCROPSDISCRIPTIONS = 13;

  private static final int LAYOUT_FRAGMENTNEWFARMINGTEACHNIQUES = 14;

  private static final int LAYOUT_FRAGMENTNEWTECHNIQUESDISCRIPTIONS = 15;

  private static final int LAYOUT_FRAGMENTNEWFARMINGCROPS = 16;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAILS = 17;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(17);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.activity_farmer_layout, LAYOUT_ACTIVITYFARMERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.activity_sign_in, LAYOUT_ACTIVITYSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.activity_sign_up, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_contact__page, LAYOUT_FRAGMENTCONTACTPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_crop__detail, LAYOUT_FRAGMENTCROPDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_crop__suggestion, LAYOUT_FRAGMENTCROPSUGGESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_farmer__shop, LAYOUT_FRAGMENTFARMERSHOP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_government__scheme__discription, LAYOUT_FRAGMENTGOVERNMENTSCHEMEDISCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_government__schemes, LAYOUT_FRAGMENTGOVERNMENTSCHEMES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_market__place__layout, LAYOUT_FRAGMENTMARKETPLACELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_new__crops__discriptions, LAYOUT_FRAGMENTNEWCROPSDISCRIPTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_new__farming__teachniques, LAYOUT_FRAGMENTNEWFARMINGTEACHNIQUES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_new__techniques__discriptions, LAYOUT_FRAGMENTNEWTECHNIQUESDISCRIPTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_new_farming__crops, LAYOUT_FRAGMENTNEWFARMINGCROPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agriconnect.R.layout.fragment_product__details, LAYOUT_FRAGMENTPRODUCTDETAILS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYFARMERLAYOUT: {
          if ("layout/activity_farmer_layout_0".equals(tag)) {
            return new ActivityFarmerLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_farmer_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNIN: {
          if ("layout/activity_sign_in_0".equals(tag)) {
            return new ActivitySignInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign_in is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNUP: {
          if ("layout/activity_sign_up_0".equals(tag)) {
            return new ActivitySignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign_up is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONTACTPAGE: {
          if ("layout/fragment_contact__page_0".equals(tag)) {
            return new FragmentContactPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_contact__page is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCROPDETAIL: {
          if ("layout/fragment_crop__detail_0".equals(tag)) {
            return new FragmentCropDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_crop__detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCROPSUGGESTION: {
          if ("layout/fragment_crop__suggestion_0".equals(tag)) {
            return new FragmentCropSuggestionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_crop__suggestion is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFARMERSHOP: {
          if ("layout/fragment_farmer__shop_0".equals(tag)) {
            return new FragmentFarmerShopBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_farmer__shop is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGOVERNMENTSCHEMEDISCRIPTION: {
          if ("layout/fragment_government__scheme__discription_0".equals(tag)) {
            return new FragmentGovernmentSchemeDiscriptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_government__scheme__discription is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGOVERNMENTSCHEMES: {
          if ("layout/fragment_government__schemes_0".equals(tag)) {
            return new FragmentGovernmentSchemesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_government__schemes is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMARKETPLACELAYOUT: {
          if ("layout/fragment_market__place__layout_0".equals(tag)) {
            return new FragmentMarketPlaceLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_market__place__layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWCROPSDISCRIPTIONS: {
          if ("layout/fragment_new__crops__discriptions_0".equals(tag)) {
            return new FragmentNewCropsDiscriptionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new__crops__discriptions is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWFARMINGTEACHNIQUES: {
          if ("layout/fragment_new__farming__teachniques_0".equals(tag)) {
            return new FragmentNewFarmingTeachniquesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new__farming__teachniques is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWTECHNIQUESDISCRIPTIONS: {
          if ("layout/fragment_new__techniques__discriptions_0".equals(tag)) {
            return new FragmentNewTechniquesDiscriptionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new__techniques__discriptions is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWFARMINGCROPS: {
          if ("layout/fragment_new_farming__crops_0".equals(tag)) {
            return new FragmentNewFarmingCropsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new_farming__crops is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTDETAILS: {
          if ("layout/fragment_product__details_0".equals(tag)) {
            return new FragmentProductDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product__details is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(17);

    static {
      sKeys.put("layout/activity_farmer_layout_0", com.example.agriconnect.R.layout.activity_farmer_layout);
      sKeys.put("layout/activity_main_0", com.example.agriconnect.R.layout.activity_main);
      sKeys.put("layout/activity_sign_in_0", com.example.agriconnect.R.layout.activity_sign_in);
      sKeys.put("layout/activity_sign_up_0", com.example.agriconnect.R.layout.activity_sign_up);
      sKeys.put("layout/fragment_contact__page_0", com.example.agriconnect.R.layout.fragment_contact__page);
      sKeys.put("layout/fragment_crop__detail_0", com.example.agriconnect.R.layout.fragment_crop__detail);
      sKeys.put("layout/fragment_crop__suggestion_0", com.example.agriconnect.R.layout.fragment_crop__suggestion);
      sKeys.put("layout/fragment_farmer__shop_0", com.example.agriconnect.R.layout.fragment_farmer__shop);
      sKeys.put("layout/fragment_government__scheme__discription_0", com.example.agriconnect.R.layout.fragment_government__scheme__discription);
      sKeys.put("layout/fragment_government__schemes_0", com.example.agriconnect.R.layout.fragment_government__schemes);
      sKeys.put("layout/fragment_home_0", com.example.agriconnect.R.layout.fragment_home);
      sKeys.put("layout/fragment_market__place__layout_0", com.example.agriconnect.R.layout.fragment_market__place__layout);
      sKeys.put("layout/fragment_new__crops__discriptions_0", com.example.agriconnect.R.layout.fragment_new__crops__discriptions);
      sKeys.put("layout/fragment_new__farming__teachniques_0", com.example.agriconnect.R.layout.fragment_new__farming__teachniques);
      sKeys.put("layout/fragment_new__techniques__discriptions_0", com.example.agriconnect.R.layout.fragment_new__techniques__discriptions);
      sKeys.put("layout/fragment_new_farming__crops_0", com.example.agriconnect.R.layout.fragment_new_farming__crops);
      sKeys.put("layout/fragment_product__details_0", com.example.agriconnect.R.layout.fragment_product__details);
    }
  }
}
