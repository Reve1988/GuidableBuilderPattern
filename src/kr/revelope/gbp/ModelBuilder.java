package kr.revelope.gbp;

public class ModelBuilder implements ModelASetter, ModelBSetter, ModelCSetter, ModelOptionSetter {
	private Model model;

	private ModelBuilder() {
		this.model = new Model();
	}

	public static ModelASetter create() {
		return new ModelBuilder();
	}

	@Override
	public ModelBSetter setA(String a) {
		model.setA(a);
		return this;
	}

	@Override
	public ModelCSetter setBTo1() {
		model.setB(1);
		return this;
	}

	@Override
	public ModelOptionSetter setBTo2() {
		model.setB(2);
		return this;
	}

	@Override
	public ModelOptionSetter setC(String c) {
		model.setC(c);
		return this;
	}

	@Override
	public ModelOptionSetter setD(String d) {
		model.setD(d);
		return this;
	}

	@Override
	public ModelOptionSetter setE(String e) {
		model.setE(e);
		return this;
	}

	@Override
	public ModelOptionSetter setF(String f) {
		model.setF(f);
		return this;
	}

	@Override
	public Model build() {
		return model;
	}
}
